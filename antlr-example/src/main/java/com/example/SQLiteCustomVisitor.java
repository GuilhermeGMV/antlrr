package com.example;

import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

/**
 * Visitor customizado para interpretar comandos SQLite
 */
public class SQLiteCustomVisitor extends SQLiteParserBaseVisitor<Void> {
    
    private int selectCount = 0;
    private int insertCount = 0;
    private int updateCount = 0;
    private int deleteCount = 0;
    private int createCount = 0;
    private int dropCount = 0;
    
    private List<String> tableNames = new ArrayList<>();
    private List<String> columnNames = new ArrayList<>();
    private Map<String, String> operations = new HashMap<>();
    
    @Override
    public Void visitSelect_stmt(SQLiteParser.Select_stmtContext ctx) {
        selectCount++;
        System.out.println("Visitor: Processando SELECT #" + selectCount);
        
        // Extrai informações do SELECT
        if (ctx.table_or_subquery() != null && !ctx.table_or_subquery().isEmpty()) {
            for (SQLiteParser.Table_or_subqueryContext table : ctx.table_or_subquery()) {
                if (table.table_name() != null) {
                    String tableName = table.table_name().getText();
                    tableNames.add(tableName);
                    System.out.println("  - Tabela consultada: " + tableName);
                }
            }
        }
        
        // Processa colunas do resultado
        if (ctx.result_column() != null) {
            for (SQLiteParser.Result_columnContext col : ctx.result_column()) {
                if (col.STAR() != null) {
                    System.out.println("  - Selecionando todas as colunas (*)");
                } else if (col.expr() != null) {
                    System.out.println("  - Coluna/Expressão: " + col.expr().getText());
                }
            }
        }
        
        operations.put("SELECT_" + selectCount, "Consulta de dados");
        return super.visitSelect_stmt(ctx);
    }
    
    @Override
    public Void visitInsert_stmt(SQLiteParser.Insert_stmtContext ctx) {
        insertCount++;
        System.out.println("Visitor: Processando INSERT #" + insertCount);
        
        if (ctx.table_name() != null) {
            String tableName = ctx.table_name().getText();
            tableNames.add(tableName);
            System.out.println("  - Inserindo na tabela: " + tableName);
        }
        
        // Conta colunas especificadas
        if (ctx.column_name() != null) {
            System.out.println("  - Colunas especificadas: " + ctx.column_name().size());
            for (SQLiteParser.Column_nameContext col : ctx.column_name()) {
                columnNames.add(col.getText());
                System.out.println("    * " + col.getText());
            }
        }
        
        operations.put("INSERT_" + insertCount, "Inserção de dados");
        return super.visitInsert_stmt(ctx);
    }
    
    @Override
    public Void visitUpdate_stmt(SQLiteParser.Update_stmtContext ctx) {
        updateCount++;
        System.out.println("Visitor: Processando UPDATE #" + updateCount);
        
        if (ctx.table_name() != null) {
            String tableName = ctx.table_name().getText();
            tableNames.add(tableName);
            System.out.println("  - Atualizando tabela: " + tableName);
        }
        
        // Conta atribuições SET
        if (ctx.column_name() != null) {
            System.out.println("  - Colunas sendo atualizadas: " + ctx.column_name().size());
            for (SQLiteParser.Column_nameContext col : ctx.column_name()) {
                System.out.println("    * " + col.getText());
            }
        }
        
        operations.put("UPDATE_" + updateCount, "Atualização de dados");
        return super.visitUpdate_stmt(ctx);
    }
    
    @Override
    public Void visitDelete_stmt(SQLiteParser.Delete_stmtContext ctx) {
        deleteCount++;
        System.out.println("Visitor: Processando DELETE #" + deleteCount);
        
        if (ctx.table_name() != null) {
            String tableName = ctx.table_name().getText();
            tableNames.add(tableName);
            System.out.println("  - Deletando da tabela: " + tableName);
        }
        
        operations.put("DELETE_" + deleteCount, "Remoção de dados");
        return super.visitDelete_stmt(ctx);
    }
    
    @Override
    public Void visitCreate_table_stmt(SQLiteParser.Create_table_stmtContext ctx) {
        createCount++;
        System.out.println("Visitor: Processando CREATE TABLE #" + createCount);
        
        if (ctx.table_name() != null) {
            String tableName = ctx.table_name().getText();
            tableNames.add(tableName);
            System.out.println("  - Criando tabela: " + tableName);
        }
        
        // Conta definições de colunas
        if (ctx.column_def() != null) {
            System.out.println("  - Colunas definidas: " + ctx.column_def().size());
            for (SQLiteParser.Column_defContext col : ctx.column_def()) {
                if (col.column_name() != null) {
                    String colName = col.column_name().getText();
                    columnNames.add(colName);
                    String type = col.type_name() != null ? col.type_name().getText() : "SEM_TIPO";
                    System.out.println("    * " + colName + " (" + type + ")");
                }
            }
        }
        
        operations.put("CREATE_" + createCount, "Criação de tabela");
        return super.visitCreate_table_stmt(ctx);
    }
    
    @Override
    public Void visitDrop_stmt(SQLiteParser.Drop_stmtContext ctx) {
        dropCount++;
        System.out.println("Visitor: Processando DROP #" + dropCount);
        
        if (ctx.object_name() != null) {
            String objectName = ctx.object_name().getText();
            System.out.println("  - Removendo objeto: " + objectName);
        }
        
        operations.put("DROP_" + dropCount, "Remoção de objeto");
        return super.visitDrop_stmt(ctx);
    }
    
    public void printSummary() {
        System.out.println("=== RESUMO DO VISITOR ===");
        System.out.println("Total de comandos processados: " + 
                          (selectCount + insertCount + updateCount + deleteCount + createCount + dropCount));
        System.out.println("- SELECT: " + selectCount);
        System.out.println("- INSERT: " + insertCount);
        System.out.println("- UPDATE: " + updateCount);
        System.out.println("- DELETE: " + deleteCount);
        System.out.println("- CREATE: " + createCount);
        System.out.println("- DROP: " + dropCount);
        
        System.out.println("\nTabelas mencionadas (" + tableNames.size() + "):");
        tableNames.stream().distinct().forEach(name -> System.out.println("  - " + name));
        
        System.out.println("\nColunas identificadas (" + columnNames.size() + "):");
        columnNames.stream().distinct().forEach(name -> System.out.println("  - " + name));
        
        System.out.println("\nOperações interpretadas:");
        operations.forEach((key, value) -> System.out.println("  " + key + ": " + value));
    }
}