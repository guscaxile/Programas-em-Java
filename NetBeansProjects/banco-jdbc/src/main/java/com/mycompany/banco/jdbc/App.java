package com.mycompany.banco.jdbc;

/**
 *
 * @author gustavo
 */
public class App {
    
    public static void main(String[] args) {
        
        ConexaoBD conexao = new ConexaoBD();
        
        conexao.getConexao().execute("drop table if exists filme");
        
        conexao.getConexao().execute("create table filme("
                + "id int primary key auto_increment,"
                + "nome varchar(255),"
                + "ano_lancamento int"
                + ");");
        
        conexao.getConexao().update("insert into filme values"
                + "(null, ?, ?)", "Shrek Para Sempre", 2010);
    }
}
