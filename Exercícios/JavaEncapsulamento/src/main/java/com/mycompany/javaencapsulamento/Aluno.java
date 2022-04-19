package com.mycompany.javaencapsulamento;

public class Aluno {

    private String ra;
    private String nome;
    private String curso;
    private Double nota1;
    private Double nota2;
    
    public Aluno(String ra, String nome, String curso){
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
    }

    public Aluno(String ra, String nome, String curso, Double nota1, Double nota2) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getRa() {

        return ra;
    }

    public String getNome() {

        return nome;
    }

    public String getCurso() {

        return curso;
    }

    public Double getNota1() {

        return nota1;
    }

    public Double getNota2() {

        return nota2;
    }

    public void setRa(String ra) {

        this.ra = ra;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setCurso(String curso) {

        this.curso = curso;
    }

    public void setNota1(Double nota1) {

        this.nota1 = nota1;
    }

    public void setNota2(Double nota2) {

        this.nota2 = nota2;
    }

    public Double getMedia() {

        return (this.nota1 + this.nota2) / 2;
    }

    @Override
    public String toString() {
        
        String texto = "Nome: %s \nNota01: %.1f\nMedia: %.1f";
        return String.format(texto, this.nome, this.nota1, this.getMedia());
    }
}
