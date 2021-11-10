package com.mycompany.javaencapsulamento;

public class TesteAluno {

    public static void main(String[] args) {

        //versão número 1
        //aluno1.ra = "123";
        //aluno1.nome = "Gustavo Caxilé";
        //aluno1.curso = "ADS";
        //aluno1.nota1 = 8.0;
        //aluno1.nota2 = 10.0;
        //System.out.println("Nome: " + aluno1.nome);
        //System.out.println("RA: " + aluno1.ra);
        //System.out.println("Curso: " + aluno1.curso);
        //System.out.println("AC 1: " + aluno1.nota1);
        //System.out.println("AC 2: " + aluno1.nota2);
        //System.out.println("Média: " + (aluno1.nota1 + aluno1.nota2) / 2);
        //Aluno aluno1 = new Aluno("01211052", "Gustavo Caxilé", "ADS", 8.0, 10.0);
        //Aluno aluno2 = new Aluno("01211058", "Dener Cardozo", "CCO", 9.0, 7.0);
        //System.out.println("Nome: " + aluno1.getNome());
        //System.out.println("RA: " + aluno1.getRa());
        //System.out.println("Curso: " + aluno1.getCurso());
        //System.out.println("AC 1: " + aluno1.getNota1());
        //System.out.println("AC 2: " + aluno1.getNota2());
        //System.out.println("Média: " + aluno1.getMedia() + "\n \n");
        //System.out.println("Nome: " + aluno2.getNome());
        //System.out.println("RA: " + aluno2.getRa());
        //System.out.println("Curso: " + aluno2.getCurso());
        //System.out.println("AC 1: " + aluno2.getNota1());
        //System.out.println("AC 2: " + aluno2.getNota2());
        //System.out.println("Média: " + aluno2.getMedia());
        
        Aluno aluno3 = new Aluno("#99999", "Gerson", "CCO");

        aluno3.setNota1(10.0);
        aluno3.setNota2(8.0);

        System.out.println(aluno3.toString());
    }
}
