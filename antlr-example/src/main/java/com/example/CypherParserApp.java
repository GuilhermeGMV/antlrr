package com.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.nio.file.*;

/**
 * Aplicação principal para demonstrar o parsing de queries Cypher usando ANTLR4
 */
public class CypherParserApp {

    public static void main(String[] args) throws Exception {
        System.out.println("=== Demonstração do Parser Cypher com ANTLR4 ===\n");

        // Testa todos os arquivos cypher disponíveis
        testCypherFile("src/test/resources/test1.cypher");
        testCypherFile("src/test/resources/test2.cypher");
        testCypherFile("src/test/resources/test3.cypher");
        testCypherFile("src/test/test4.cypher");

        // Testa algumas queries diretamente
        System.out.println("\n=== Testando queries inline ===\n");
        testCypherQuery("CREATE (n:Person {name: 'João', age: 30})");
        testCypherQuery("MATCH (n:Person) WHERE n.age > 25 RETURN n.name");
        testCypherQuery("MATCH (a)-[r:KNOWS]->(b) RETURN a, r, b");
    }

    /**
     * Testa um arquivo Cypher específico
     */
    public static void testCypherFile(String filePath) {
        try {
            System.out.println("📁 Testando arquivo: " + filePath);
            
            // Lê o conteúdo do arquivo
            String input = Files.readString(Paths.get(filePath));
            System.out.println("Conteúdo: " + input.trim());
            
            parseCypherQuery(input);
            System.out.println();
            
        } catch (Exception e) {
            System.out.println("❌ Erro ao processar arquivo " + filePath + ": " + e.getMessage());
        }
    }

    /**
     * Testa uma query Cypher inline
     */
    public static void testCypherQuery(String query) {
        System.out.println("🔍 Testando query: " + query);
        parseCypherQuery(query);
        System.out.println();
    }

    /**
     * Faz o parsing de uma query Cypher usando ANTLR4
     */
    public static void parseCypherQuery(String input) {
        try {
            // Cria o lexer
            CypherLexer lexer = new CypherLexer(CharStreams.fromString(input));
            
            // Cria o stream de tokens
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // Cria o parser
            CypherParser parser = new CypherParser(tokens);
            
            // Remove listeners de erro padrão e adiciona um customizado
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                      int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.out.println("❌ Erro de sintaxe na linha " + line + ":" + charPositionInLine + " - " + msg);
                }
            });
            
            // Faz o parsing começando pela regra 'script'
            ParseTree tree = parser.script();
            
            // Verifica se houve erros
            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("Parsing bem-sucedido!");
                
                // Mostra a árvore de parsing
                System.out.println("Árvore de parsing:");
                System.out.println(tree.toStringTree(parser));
                
                // Mostra informações sobre os tokens
                System.out.println("Tokens encontrados:");
                showTokens(input);
                
            } else {
                System.out.println("Parsing falhou com " + parser.getNumberOfSyntaxErrors() + " erro(s)");
            }
            
        } catch (Exception e) {
            System.out.println("Exceção durante o parsing: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Mostra todos os tokens gerados pelo lexer
     */
    private static void showTokens(String input) {
        try {
            CypherLexer lexer = new CypherLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();
            
            for (Token token : tokens.getTokens()) {
                if (token.getType() != Token.EOF) {
                    String tokenName = CypherLexer.VOCABULARY.getSymbolicName(token.getType());
                    if (tokenName == null) {
                        tokenName = CypherLexer.VOCABULARY.getLiteralName(token.getType());
                    }
                    System.out.println("   Token: " + tokenName + " = '" + token.getText() + "'");
                }
            }
        } catch (Exception e) {
            System.out.println("   Erro ao analisar tokens: " + e.getMessage());
        }
    }
}