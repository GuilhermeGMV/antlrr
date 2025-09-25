package com.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Aplicação principal para demonstrar o parser SQLite usando ANTLR
 */
public class SQLiteParserApp {
    
    public static void main(String[] args) {
        System.out.println("=== SQLite Parser with ANTLR Demo ===");
        
        // Testa com três arquivos diferentes
        String[] testFiles = {
            "test1.sql", 
            "test2.sql", 
            "test3.sql"
        };
        
        for (String fileName : testFiles) {
            System.out.println("\n" + "=".repeat(60));
            System.out.println("TESTANDO ARQUIVO: " + fileName);
            System.out.println("=".repeat(60));
            
            try {
                processFile(fileName);
            } catch (Exception e) {
                System.err.println("Erro ao processar arquivo " + fileName + ": " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
    
    private static void processFile(String fileName) throws IOException {
        String inputPath = "src/test/resources/" + fileName;
        
        // Lê o conteúdo do arquivo
        String input;
        try {
            input = Files.readString(Paths.get(inputPath));
        } catch (IOException e) {
            System.err.println("Não foi possível ler o arquivo: " + inputPath);
            System.err.println("Usando SQL de exemplo...");
            input = getDefaultSQL(fileName);
        }
        
        System.out.println("CONTEÚDO DO ARQUIVO:");
        System.out.println("-".repeat(40));
        System.out.println(input);
        System.out.println("-".repeat(40));
        
        // Cria o lexer
        CharStream inputStream = CharStreams.fromString(input);
        SQLiteLexer lexer = new SQLiteLexer(inputStream);
        
        // Cria o stream de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // Cria o parser
        SQLiteParser parser = new SQLiteParser(tokens);
        
        // Remove listeners de erro padrão e adiciona um customizado
        parser.removeErrorListeners();
        parser.addErrorListener(new CustomErrorListener());
        
        System.out.println("\nPROCESSAMENTO:");
        System.out.println("-".repeat(40));
        
        // Executa o parsing começando pela regra inicial
        ParseTree tree = parser.parse();
        
        System.out.println("\nÁRVORE SINTÁTICA:");
        System.out.println("-".repeat(40));
        System.out.println(tree.toStringTree(parser));
        
        // Cria e executa o visitor customizado
        System.out.println("\nEXECUÇÃO DO VISITOR:");
        System.out.println("-".repeat(40));
        SQLiteCustomVisitor visitor = new SQLiteCustomVisitor();
        visitor.visit(tree);
        
        // Cria e executa o listener customizado
        System.out.println("\nEXECUÇÃO DO LISTENER:");
        System.out.println("-".repeat(40));
        SQLiteCustomListener listener = new SQLiteCustomListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        
        System.out.println("\nRESUMO DA ANÁLISE:");
        System.out.println("-".repeat(40));
        visitor.printSummary();
        listener.printSummary();
    }
    
    private static String getDefaultSQL(String fileName) {
        switch (fileName) {
            case "test1.sql":
                return "SELECT * FROM usuarios WHERE idade > 18;\n" +
                       "INSERT INTO usuarios (nome, idade) VALUES ('João', 25);\n" +
                       "UPDATE usuarios SET idade = 26 WHERE nome = 'João';";
            
            case "test2.sql":
                return "CREATE TABLE produtos (\n" +
                       "    id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                       "    nome TEXT NOT NULL,\n" +
                       "    preco REAL DEFAULT 0.0\n" +
                       ");\n" +
                       "INSERT INTO produtos (nome, preco) VALUES ('Notebook', 2500.00);\n" +
                       "SELECT nome, preco FROM produtos ORDER BY preco DESC;";
            
            case "test3.sql":
                return "DELETE FROM usuarios WHERE idade < 18;\n" +
                       "DROP TABLE IF EXISTS temp_table;\n" +
                       "CREATE INDEX idx_usuarios_nome ON usuarios(nome);\n" +
                       "SELECT COUNT(*) FROM usuarios GROUP BY cidade HAVING COUNT(*) > 10;";
            
            default:
                return "SELECT 1;";
        }
    }
    
    /**
     * Listener customizado para capturar erros de parsing
     */
    static class CustomErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                               int line, int charPositionInLine, String msg, RecognitionException e) {
            System.err.println("ERRO DE SINTAXE na linha " + line + ":" + charPositionInLine + " - " + msg);
        }
    }
}