package com.mycompany.projeto.nivelamento2;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class NovaCondicao {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número entre 1 e 7");
        Integer numeroDigitado = leitor.nextInt();
        
        switch (numeroDigitado) {
            case 1:
                System.out.println("Domingou...");
                break;
            case 2:
                System.out.println("Segundou...");
                break;
            case 3:
                System.out.println("Terçou...");
                break;
            case 4:
                System.out.println("Quartou...");
                break;
            case 5:
                System.out.println("Quintou!");
                break;
            case 6:
                System.out.println("Sextou!!!");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }
}
