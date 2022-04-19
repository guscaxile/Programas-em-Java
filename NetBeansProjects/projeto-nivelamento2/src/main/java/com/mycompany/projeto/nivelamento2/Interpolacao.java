package com.mycompany.projeto.nivelamento2;

/**
 *
 * @author gustavo
 */
public class Interpolacao {
 
    public static void main(String[] args) {
        
        String nome = "Gustavo";
        Integer idade = 21;
        Double altura = 1.95;
        
        System.out.println(String.format("Olá, meu nome é %s, tenho %d e tenho %.2f de altura.", nome, idade, altura));
        
        Double saldo = 250.5;
        
        Double vezes = (saldo / 4.40);
        
        System.out.println(vezes.intValue());
    }
}
