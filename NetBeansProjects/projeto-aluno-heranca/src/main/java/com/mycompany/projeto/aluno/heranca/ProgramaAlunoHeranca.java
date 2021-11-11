package com.mycompany.projeto.aluno.heranca;

public class ProgramaAlunoHeranca {
    
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno(111, "Gustavo", 8.0, 6.0);
        Aluno aluno2 = new Aluno(222, "Bruno", 10.0, 8.0);
        
        AlunoPos alunopos1 = new AlunoPos(333, "Flávio", 8.0, 10.0, 6.0);
        
        System.out.println(String.format("\nO aluno %s tem média: %.2f\n", aluno1.getNome(), aluno1.calculaMedia()));
        System.out.println(aluno1);
        
        System.out.println(String.format("\nO aluno %s tem média: %.2f\n", aluno2.getNome(), aluno2.calculaMedia()));
        System.out.println(aluno2);
        
        System.out.println(String.format("\nO aluno de pós graduação %s tem média %.2f\n", 
                alunopos1.nome, alunopos1.calcularMedia()));
        System.out.println(alunopos1);
    }
}
