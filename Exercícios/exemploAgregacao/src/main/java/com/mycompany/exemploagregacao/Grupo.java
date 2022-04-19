package com.mycompany.exemploagregacao;

import java.util.List;

public class Grupo {
    
    private String nome;
    private List<Contato> contatos;
    
    public void adicionar(Contato contatoParaAdicionar){
        
        this.contatos.add(contatoParaAdicionar);
    }
    
    public void remover(Contato contatoParaRemover){
        
        this.contatos.add(contatoParaRemover);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public Grupo(String nome, List<Contato> contatos) {
        this.nome = nome;
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "Grupo{" + "nome=" + nome + ", contatos=" + contatos + '}';
    }
}
