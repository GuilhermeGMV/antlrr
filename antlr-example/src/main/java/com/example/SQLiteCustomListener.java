package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Listener customizado para monitorar a execução do parsing SQLite
 */
public class SQLiteCustomListener extends SQLiteParserBaseListener {
    
    private Stack<String> contextStack = new Stack<>();
    private List<String> events = new ArrayList<>();
    private int depth = 0;
    
    private int totalStatements = 0;
    private int totalTables = 0;
    private int totalExpressions = 0;
    
    @Override
    public void enterParse(SQLiteParser.ParseContext ctx) {
        depth++;
        contextStack.push("PARSE");
        events.add(indent() + "INÍCIO: Iniciando análise do arquivo SQL");
        System.out.println("Listener: Iniciando análise do documento SQL");
    }
    
    @Override
    public void exitParse(SQLiteParser.ParseContext ctx) {
        events.add(indent() + "FIM: Análise concluída");
        System.out.println("Listener: Análise do documento concluída");
        contextStack.pop();
        depth--;
    }
    
    @Override
    public void enterSql_stmt(SQLiteParser.Sql_stmtContext ctx) {
        totalStatements++;
        depth++;
        contextStack.push("STATEMENT");
        events.add(indent() + "STATEMENT #" + totalStatements + ": " + getStatementType(ctx));
        System.out.println("Listener: Processando statement SQL #" + totalStatements);
    }
    
    @Override
    public void exitSql_stmt(SQLiteParser.Sql_stmtContext ctx) {
        events.add(indent() + "FIM STATEMENT #" + totalStatements);
        contextStack.pop();
        depth--;
    }
    
    @Override
    public void enterSelect_stmt(SQLiteParser.Select_stmtContext ctx) {
        depth++;
        contextStack.push("SELECT");
        events.add(indent() + "SELECT: Consulta de dados");
        System.out.println("Listener: Entrando em comando SELECT");
    }
    
    @Override
    public void exitSelect_stmt(SQLiteParser.Select_stmtContext ctx) {
        events.add(indent() + "SELECT: Processamento concluído");
        contextStack.pop();
        depth--;
    }
    
    @Override
    public void enterInsert_stmt(SQLiteParser.Insert_stmtContext ctx) {
        depth++;
        contextStack.push("INSERT");
        events.add(indent() + "INSERT: Inserção de dados");
        System.out.println("Listener: Entrando em comando INSERT");
    }
    
    @Override
    public void exitInsert_stmt(SQLiteParser.Insert_stmtContext ctx) {
        events.add(indent() + "INSERT: Processamento concluído");
        contextStack.pop();
        depth--;
    }
    
    @Override
    public void enterUpdate_stmt(SQLiteParser.Update_stmtContext ctx) {
        depth++;
        contextStack.push("UPDATE");
        events.add(indent() + "UPDATE: Atualização de dados");
        System.out.println("Listener: Entrando em comando UPDATE");
    }
    
    @Override
    public void exitUpdate_stmt(SQLiteParser.Update_stmtContext ctx) {
        events.add(indent() + "UPDATE: Processamento concluído");
        contextStack.pop();
        depth--;
    }
    
    @Override
    public void enterDelete_stmt(SQLiteParser.Delete_stmtContext ctx) {
        depth++;
        contextStack.push("DELETE");
        events.add(indent() + "DELETE: Remoção de dados");
        System.out.println("Listener: Entrando em comando DELETE");
    }
    
    @Override
    public void exitDelete_stmt(SQLiteParser.Delete_stmtContext ctx) {
        events.add(indent() + "DELETE: Processamento concluído");
        contextStack.pop();
        depth--;
    }
    
    @Override
    public void enterCreate_table_stmt(SQLiteParser.Create_table_stmtContext ctx) {
        depth++;
        contextStack.push("CREATE_TABLE");
        events.add(indent() + "CREATE TABLE: Criação de tabela");
        System.out.println("Listener: Entrando em comando CREATE TABLE");
    }
    
    @Override
    public void exitCreate_table_stmt(SQLiteParser.Create_table_stmtContext ctx) {
        events.add(indent() + "CREATE TABLE: Processamento concluído");
        contextStack.pop();
        depth--;
    }
    
    @Override
    public void enterDrop_stmt(SQLiteParser.Drop_stmtContext ctx) {
        depth++;
        contextStack.push("DROP");
        events.add(indent() + "DROP: Remoção de objeto");
        System.out.println("Listener: Entrando em comando DROP");
    }
    
    @Override
    public void exitDrop_stmt(SQLiteParser.Drop_stmtContext ctx) {
        events.add(indent() + "DROP: Processamento concluído");
        contextStack.pop();
        depth--;
    }
    
    @Override
    public void enterTable_name(SQLiteParser.Table_nameContext ctx) {
        totalTables++;
        events.add(indent() + "TABELA: " + ctx.getText());
        System.out.println("Listener: Referência à tabela '" + ctx.getText() + "'");
    }
    
    @Override
    public void enterExpr(SQLiteParser.ExprContext ctx) {
        totalExpressions++;
        if (ctx.getChildCount() <= 3) {  // Evita log excessivo de expressões complexas
            events.add(indent() + "EXPR: " + ctx.getText());
        }
    }
    
    @Override
    public void enterColumn_name(SQLiteParser.Column_nameContext ctx) {
        events.add(indent() + "COLUNA: " + ctx.getText());
    }
    
    private String getStatementType(SQLiteParser.Sql_stmtContext ctx) {
        if (ctx.select_stmt() != null) return "SELECT";
        if (ctx.insert_stmt() != null) return "INSERT";
        if (ctx.update_stmt() != null) return "UPDATE";
        if (ctx.delete_stmt() != null) return "DELETE";
        if (ctx.create_table_stmt() != null) return "CREATE TABLE";
        if (ctx.create_index_stmt() != null) return "CREATE INDEX";
        if (ctx.drop_stmt() != null) return "DROP";
        if (ctx.pragma_stmt() != null) return "PRAGMA";
        if (ctx.explain_stmt() != null) return "EXPLAIN";
        return "UNKNOWN";
    }
    
    private String indent() {
        return "  ".repeat(Math.max(0, depth - 1));
    }
    
    public void printSummary() {
        System.out.println("=== RESUMO DO LISTENER ===");
        System.out.println("Total de statements processados: " + totalStatements);
        System.out.println("Total de referências a tabelas: " + totalTables);
        System.out.println("Total de expressões processadas: " + totalExpressions);
        System.out.println("Total de eventos capturados: " + events.size());
        
        System.out.println("\nEventos capturados (últimos 10):");
        int start = Math.max(0, events.size() - 10);
        for (int i = start; i < events.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + events.get(i));
        }
        
        System.out.println("\nContexto atual da pilha: " + 
                          (contextStack.isEmpty() ? "VAZIO" : String.join(" > ", contextStack)));
    }
}