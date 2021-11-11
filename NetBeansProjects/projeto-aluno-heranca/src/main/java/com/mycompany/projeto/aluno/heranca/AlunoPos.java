package com.mycompany.projeto.aluno.heranca;

public class AlunoPos extends Aluno{
    
    private Double notaMonografia;

    public AlunoPos(Integer ra, String nome, Double notaMonografia, Double notaContinuada, Double notaSemestral) {
        super(ra, nome, notaContinuada, notaSemestral);
        this.notaMonografia = notaMonografia;
    }

    public AlunoPos(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }

    public Double calcularMedia(){
        return (super.notaContinuada + super.notaSemestral + notaMonografia) / 3;
    }

    @Override
    public String toString() {
        
        return String.format("RA: %d\n"
                + "Nome: %s\n"
                + "Nota AC: %.2f\n"
                + "Nota semestral: %.2f\n"
                + "Média: %.2f",
                super.ra, super.nome, super.notaContinuada, super.notaSemestral, this.calcularMedia());
    }
}
