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
public class Idade {
    
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        
        Integer idade, ano;
        String nome;
        
        System.out.println("Digite o seu nome:");
        nome = leitura.nextLine();
        
        System.out.println("Olá, " + nome + "! \n"
                + "Qual é o ano do seu nascimento?");
        ano = leitura.nextInt();
        
        idade = 2030 - ano;
        
        System.out.println("Em 2030, você terá " + idade + " anos!");
        
    }
    
}
