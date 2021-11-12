package com.mycompany.projeto.aluno.heranca;

public class ProgramaAlunoHeranca {
    
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno(111, "Gustavo", 8.0, 10.0);
        
        System.out.println(String.format("O aluno %s tem média %.2f\n", 
                aluno1.getNome(),aluno1.calculaMedia()));
        
        System.out.println(aluno1);
        
        AlunoPos aluno2 = new AlunoPos(222, "Bruno", 7.0, 6.0, 10.0);
        
        System.out.println(String.format("\nO aluno de pós graduação %s tem média %.2f\n", 
                aluno2.nome,aluno2.calcularMediaPos()));
        
        System.out.println(aluno2);
        
        Faculdade facul1 = new Faculdade("Bandtec", 55);
        
        facul1.matricularAluno(aluno1);
        facul1.matricularAluno(aluno2);
        
        facul1.exibirAlunosMatriculados();
        
        System.out.println(facul1);
    }
}
