package com.mycompany.projeto.nivelamento2;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Lacos {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Contador: " + i);
        }
        
        System.out.println("Exemplo 02: for 10 a 0");
        for (int i = 10; i >= 0; i--) {
            
            System.out.println("Contador: " + i);
        }
        
        System.out.println("Exemplo 03: While - acerte um número");
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Acerte o número: ");
        Integer numeroDigitado = leitor.nextInt();
        
        Integer numeroSecreto = 42;
        while (numeroDigitado != numeroSecreto) {            
            
            System.out.println("ERROUUU!! Tente novamente :)");
            numeroDigitado = leitor.nextInt();
        }
        
        System.out.println("Acertou bichão");
        
        System.out.println("Exemplo 04: while - 0 a 10");
        
        Integer contador = 0;
        while(contador <= 10){
            
            System.out.println("Contador: " + contador);
            contador++;
        }
        
        Integer numeroDigitado2 = 42;
        do {            
            
            System.out.println("Acerte o número: ");
            numeroDigitado2 = leitor.nextInt();
        } while (numeroDigitado2 != numeroSecreto);
    }
}
