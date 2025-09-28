package com.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.TreeViewer;
import java.io.*;
import java.util.*;

/**
 * Utilitário para gerar visualizações das árvores de parsing
 */
public class CypherTreeVisualizer {

    public static void main(String[] args) throws Exception {
        System.out.println("🌳 === VISUALIZADOR DE ÁRVORES CYPHER ANTLR4 ===\n");

        // Queries de exemplo para visualização
        String[] queries = {
            "MATCH (n) RETURN n",
            "CREATE (person:Person {name: \"Ana\", age: 30})",
            "MATCH (a)--(b) WHERE a.id > 5 RETURN a.name, b.type"
        };

        for (String query : queries) {
            System.out.println("📝 Processando query: " + query);
            generateParseTreeInfo(query);
            System.out.println();
        }
        
        // Gera arquivo DOT para visualização
        generateDotFile("MATCH (user:Person) WHERE user.active = true RETURN user.name");
    }

    private static void generateParseTreeInfo(String query) {
        try {
            CypherLexer lexer = new CypherLexer(CharStreams.fromString(query));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CypherParser parser = new CypherParser(tokens);
            
            // Remove error listeners para capturar erros silenciosamente
            parser.removeErrorListeners();
            
            ParseTree tree = parser.script();
            
            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("   ✅ Parsing bem-sucedido");
                
                // Mostra estrutura hierárquica
                System.out.println("   📊 Estrutura da árvore:");
                printTreeStructure(tree, parser, 2);
                
                // Estatísticas da árvore
                TreeStats stats = analyzeTree(tree);
                System.out.println("   📈 Estatísticas:");
                System.out.println("      • Profundidade máxima: " + stats.maxDepth);
                System.out.println("      • Total de nós: " + stats.totalNodes);
                System.out.println("      • Nós terminais: " + stats.terminalNodes);
                System.out.println("      • Nós não-terminais: " + stats.nonTerminalNodes);
                
            } else {
                System.out.println("   ❌ Parsing falhou (" + parser.getNumberOfSyntaxErrors() + " erro(s))");
            }
            
        } catch (Exception e) {
            System.out.println("   ❌ Exceção: " + e.getMessage());
        }
    }
    
    private static void printTreeStructure(ParseTree tree, CypherParser parser, int indent) {
        // Limita a profundidade para evitar saída muito longa
        if (indent > 10) {
            printIndent(indent);
            System.out.println("... (estrutura continua)");
            return;
        }
        
        printIndent(indent);
        
        if (tree instanceof TerminalNode) {
            System.out.println("'" + tree.getText() + "'");
        } else {
            String ruleName = parser.getRuleNames()[((RuleContext) tree).getRuleIndex()];
            System.out.println(ruleName);
            
            // Mostra apenas os primeiros filhos para não poluir a saída
            int maxChildren = 5;
            for (int i = 0; i < Math.min(tree.getChildCount(), maxChildren); i++) {
                printTreeStructure(tree.getChild(i), parser, indent + 1);
            }
            
            if (tree.getChildCount() > maxChildren) {
                printIndent(indent + 1);
                System.out.println("... (" + (tree.getChildCount() - maxChildren) + " filhos adicionais)");
            }
        }
    }
    
    private static void printIndent(int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("   ");
        }
    }
    
    private static TreeStats analyzeTree(ParseTree tree) {
        TreeStats stats = new TreeStats();
        analyzeTreeRecursive(tree, 0, stats);
        return stats;
    }
    
    private static void analyzeTreeRecursive(ParseTree tree, int depth, TreeStats stats) {
        stats.totalNodes++;
        stats.maxDepth = Math.max(stats.maxDepth, depth);
        
        if (tree instanceof TerminalNode) {
            stats.terminalNodes++;
        } else {
            stats.nonTerminalNodes++;
            for (int i = 0; i < tree.getChildCount(); i++) {
                analyzeTreeRecursive(tree.getChild(i), depth + 1, stats);
            }
        }
    }
    
    private static void generateDotFile(String query) {
        System.out.println("🎨 Gerando arquivo DOT para visualização gráfica...");
        System.out.println("   Query: " + query);
        
        try {
            CypherLexer lexer = new CypherLexer(CharStreams.fromString(query));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CypherParser parser = new CypherParser(tokens);
            
            parser.removeErrorListeners();
            ParseTree tree = parser.script();
            
            if (parser.getNumberOfSyntaxErrors() == 0) {
                // Gera conteúdo DOT
                String dot = generateDotContent(tree, parser);
                
                // Salva arquivo
                try (FileWriter writer = new FileWriter("cypher_parse_tree.dot")) {
                    writer.write(dot);
                }
                
                System.out.println("   ✅ Arquivo 'cypher_parse_tree.dot' gerado com sucesso!");
                System.out.println("   💡 Para visualizar:");
                System.out.println("      • Use Graphviz: dot -Tpng cypher_parse_tree.dot -o tree.png");
                System.out.println("      • Ou visite: https://dreampuf.github.io/GraphvizOnline/");
                
            } else {
                System.out.println("   ❌ Não foi possível gerar DOT devido a erros de parsing");
            }
            
        } catch (Exception e) {
            System.out.println("   ❌ Erro ao gerar arquivo DOT: " + e.getMessage());
        }
    }
    
    private static String generateDotContent(ParseTree tree, CypherParser parser) {
        StringBuilder sb = new StringBuilder();
        sb.append("digraph ParseTree {\n");
        sb.append("  rankdir=TB;\n");
        sb.append("  node [shape=box, style=rounded];\n\n");
        
        Map<ParseTree, Integer> nodeIds = new HashMap<>();
        generateDotNodes(tree, parser, sb, nodeIds, 0);
        generateDotEdges(tree, sb, nodeIds);
        
        sb.append("}\n");
        return sb.toString();
    }
    
    private static int generateDotNodes(ParseTree tree, CypherParser parser, StringBuilder sb, Map<ParseTree, Integer> nodeIds, int nextId) {
        int currentId = nextId++;
        nodeIds.put(tree, currentId);
        
        String label;
        String color;
        
        if (tree instanceof TerminalNode) {
            label = "\"" + tree.getText().replace("\"", "\\\"").replace("\n", "\\n") + "\"";
            color = "lightblue";
        } else {
            String ruleName = parser.getRuleNames()[((RuleContext) tree).getRuleIndex()];
            label = ruleName;
            color = "lightgreen";
        }
        
        sb.append("  node").append(currentId)
          .append(" [label=").append(label)
          .append(", fillcolor=").append(color)
          .append(", style=filled];\n");
        
        for (int i = 0; i < tree.getChildCount(); i++) {
            nextId = generateDotNodes(tree.getChild(i), parser, sb, nodeIds, nextId);
        }
        
        return nextId;
    }
    
    private static void generateDotEdges(ParseTree tree, StringBuilder sb, Map<ParseTree, Integer> nodeIds) {
        Integer parentId = nodeIds.get(tree);
        
        for (int i = 0; i < tree.getChildCount(); i++) {
            ParseTree child = tree.getChild(i);
            Integer childId = nodeIds.get(child);
            sb.append("  node").append(parentId).append(" -> node").append(childId).append(";\n");
            generateDotEdges(child, sb, nodeIds);
        }
    }
    
    private static class TreeStats {
        int maxDepth = 0;
        int totalNodes = 0;
        int terminalNodes = 0;
        int nonTerminalNodes = 0;
    }
}