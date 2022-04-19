/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.meu.primeiro.programa;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Calculadora {
 
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        Integer a, b, soma, subtracao, multiplicacao;
        
        System.out.println("\n");
        System.out.println("Digite o primeiro número:");
        a = leitura.nextInt();
        
        System.out.println("\n");
        System.out.println("Digite o segundo número:");
        b = leitura.nextInt();
        
        System.out.println("\n");
        
        System.out.println("###############################################");
        
        System.out.println("\n");
        
        soma = a + b;
        subtracao = a - b;
        multiplicacao = a * b;
        
        System.out.println("A soma é " + soma);
        System.out.println("A subtração é " + subtracao);
        System.out.println("A multiplicação é " + multiplicacao);
    }
    
}
