package com.mycompany.exemploagregacao;

public class Contato {

    private String nome;
    private String telefone;
    private Boolean bloqueado;

    public Contato(String nome, String telefone, Boolean bloqueado) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = bloqueado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(Boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", telefone=" + telefone + ", bloqueado=" + bloqueado + '}';
    }
}
