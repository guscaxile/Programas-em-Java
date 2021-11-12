package com.mycompany.projeto.aluno.heranca;

public class Aluno {

    protected Integer ra;
    protected String nome;
    protected Double notaContinuada;
    protected Double notaSemestral;

    public Aluno(Integer ra, String nome, Double notaContinuada, Double notaSemestral) {
        this.ra = ra;
        this.nome = nome;
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
    }

    public Double calculaMedia() {

        return notaContinuada * 0.4 + notaSemestral * 0.6;
    }

    public Integer getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public Double getNotaSemestral() {
        return notaSemestral;
    }

    @Override
    public String toString() {

        return String.format("RA: %d\n"
                + "Nome: %s\n"
                + "Nota AC: %.2f\n"
                + "Nota semestral: %.2f\n"
                + "Média: %.2f",
                ra, nome, notaContinuada, notaSemestral, this.calculaMedia());
    }
}
