package com.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.nio.file.*;

/**
 * Demonstração específica focada nos casos que funcionam bem
 */
public class CypherDemoApp {

    public static void main(String[] args) throws Exception {
        System.out.println("=== DEMONSTRAÇÃO DETALHADA DO PARSER CYPHER ANTLR4 ===\n");

        // Casos que funcionam bem
        System.out.println("=== CASOS QUE FUNCIONAM PERFEITAMENTE ===\n");
        
        testQuery("Chamada de procedimento", 
                 "CALL test.proc(a, b, c) RETURN *");
        
        testQuery("Nós simples", 
                 "MATCH (a), (b), (c) RETURN a, b, c");
        
        testQuery("Criação de nó vazio", 
                 "CREATE ()");
        
        testQuery("Query multi-parte", 
                 "MATCH (a) WITH a DELETE a RETURN a");
        
        testQuery("WHERE com comparação", 
                 "MATCH (n) WHERE n.age > 25 RETURN n");
        
        testQuery("Projeção com alias", 
                 "MATCH (n) RETURN n.name AS nome");
        
        System.out.println("\n=== CASOS COM LIMITAÇÕES CONHECIDAS ===\n");
        
        testQuery("String com aspas simples (limitação do lexer)", 
                 "CREATE (n {name: \"João\"})");
        
        testQuery("Relacionamento simples", 
                 "MATCH (a)--(b) RETURN a, b");
        
        // Vamos mostrar também a análise de tokens
        System.out.println("\n🔬 === ANÁLISE DETALHADA DE TOKENS ===\n");
        
        analyzeTokens("Análise completa", "MATCH (user:Person) WHERE user.active = true RETURN user.name");
    }

    private static void testQuery(String description, String query) {
        System.out.println("📋 " + description + ":");
        System.out.println("   Query: " + query);
        
        try {
            CypherLexer lexer = new CypherLexer(CharStreams.fromString(query));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CypherParser parser = new CypherParser(tokens);
            
            // Captura erros
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                      int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.out.println("   ❌ Erro: linha " + line + ":" + charPositionInLine + " - " + msg);
                }
            });
            
            ParseTree tree = parser.script();
            
            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("Status: PARSING BEM-SUCEDIDO");
                
                // Conta elementos da árvore
                countElements(tree, parser);
                
            } else {
                System.out.println("Status: PARSING FALHOU (" + parser.getNumberOfSyntaxErrors() + " erro(s))");
            }
            
        } catch (Exception e) {
            System.out.println("Exceção: " + e.getMessage());
        }
        
        System.out.println();
    }
    
    private static void countElements(ParseTree tree, CypherParser parser) {
        ElementCounter counter = new ElementCounter();
        counter.visit(tree);
        
        System.out.println("Elementos encontrados:");
        System.out.println("      • Nós: " + counter.nodeCount);
        System.out.println("      • Comandos: " + counter.commandCount);
        System.out.println("      • Expressões: " + counter.expressionCount);
        System.out.println("      • Símbolos: " + counter.symbolCount);
    }
    
    private static void analyzeTokens(String description, String query) {
        System.out.println("" + description + ":");
        System.out.println("   Query: " + query);
        System.out.println("   Tokens:");
        
        try {
            CypherLexer lexer = new CypherLexer(CharStreams.fromString(query));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();
            
            int tokenCount = 0;
            for (Token token : tokens.getTokens()) {
                if (token.getType() != Token.EOF && !token.getText().trim().isEmpty()) {
                    String tokenName = CypherLexer.VOCABULARY.getSymbolicName(token.getType());
                    if (tokenName == null) {
                        tokenName = CypherLexer.VOCABULARY.getLiteralName(token.getType());
                    }
                    
                    System.out.println("      " + (++tokenCount) + ". " + tokenName + " = '" + 
                                     token.getText().replace("\n", "\\n") + "'");
                }
            }
            
        } catch (Exception e) {
            System.out.println("   ❌ Erro na análise: " + e.getMessage());
        }
        
        System.out.println();
    }
    
    // Visitor simples para contar elementos
    private static class ElementCounter extends CypherParserBaseVisitor<Void> {
        int nodeCount = 0;
        int commandCount = 0;
        int expressionCount = 0;
        int symbolCount = 0;
        
        @Override
        public Void visitNodePattern(CypherParser.NodePatternContext ctx) {
            nodeCount++;
            return super.visitNodePattern(ctx);
        }
        
        @Override
        public Void visitMatchSt(CypherParser.MatchStContext ctx) {
            commandCount++;
            return super.visitMatchSt(ctx);
        }
        
        @Override
        public Void visitCreateSt(CypherParser.CreateStContext ctx) {
            commandCount++;
            return super.visitCreateSt(ctx);
        }
        
        @Override
        public Void visitReturnSt(CypherParser.ReturnStContext ctx) {
            commandCount++;
            return super.visitReturnSt(ctx);
        }
        
        @Override
        public Void visitExpression(CypherParser.ExpressionContext ctx) {
            expressionCount++;
            return super.visitExpression(ctx);
        }
        
        @Override
        public Void visitSymbol(CypherParser.SymbolContext ctx) {
            symbolCount++;
            return super.visitSymbol(ctx);
        }
    }
}