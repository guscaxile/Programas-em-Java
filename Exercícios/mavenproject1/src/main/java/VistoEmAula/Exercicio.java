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
public class Exercicio {
    
    public static void main(String[] args) {
        
        Scanner leitorNumerico = new Scanner(System.in);
        
        System.out.println("Digite o seu saldo:");
        Double saldoPassagem = leitorNumerico.nextDouble() / 4.40;
        
        Integer quantidadeInteiro = saldoPassagem.intValue();
        
        System.out.println("\tVocê ainda pode utilizar o metrô " 
                + saldoPassagem + " vezes");
    }
}
