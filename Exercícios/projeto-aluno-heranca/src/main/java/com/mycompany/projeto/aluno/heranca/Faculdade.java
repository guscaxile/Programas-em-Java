package com.mycompany.projeto.aluno.heranca;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    
    private String nome;
    private Integer vagas;
    private List<Aluno> alunos;
    
    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.alunos = new ArrayList<>();
    }
    
    public void matricularAluno(Aluno alunoQlq) {

        if (vagas >= 1) {
            this.alunos.add(alunoQlq);
            vagas--;
        }
    }
    
    public void exibirAlunosMatriculados() {

        for (Aluno aluno : alunos) {
            
            if (alunos != null) {
                System.out.println(aluno);
            } else {
                System.out.println(String.format("A faculdade %s não possui alunos cadastrados",
                        this.nome));
            }
        }
    }
    
    public void exibirAlunoPos() {
        
        System.out.println("\nSomente Aluno Pos");
        
        for (Aluno aluno : alunos) {
            
            if (aluno != null) {
                
                if (aluno instanceof AlunoPos) {
                    System.out.println(aluno);
                }
            } else {
                System.out.println(String.format("A faculdade %s não possui alunos cadastrados",
                        this.nome));
            }
        }
    }
}
