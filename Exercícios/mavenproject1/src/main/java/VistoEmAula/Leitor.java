package VistoEmAula;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo.caxile
 */
public class Leitor {
    
    public static void main(String[] args) {
        
        //declaração padrão de um objeto do tipo Scanner
        Scanner leitorNumerico = new Scanner(System.in);
        Scanner leitorAlfaNumerico = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        //pra ver textos no console usar o "next" ou "nextLine" 
        String nome = leitorAlfaNumerico.nextLine();
        
        System.out.println("\tSeja bem vindo " + nome + "\n");
        
        System.out.println("Digite a sua idade:");
        Integer idade = leitorNumerico.nextInt();
        
        System.out.println("\tA sua idade é: " + idade + "\n");
        
        System.out.println("Digite a faculdade que você estuda:");
        String nomeFaculdade = leitorAlfaNumerico.nextLine();
        
        System.out.println("\tA melhor faculdade de SP: " + nomeFaculdade + "\n");
        
        System.out.println("Digite a sua pretenção salarial:");
        Double salarioDosSonhos = leitorNumerico.nextDouble();
        
        System.out.println("\tTá querendo demais!! " + salarioDosSonhos + "\n");
    }
}
