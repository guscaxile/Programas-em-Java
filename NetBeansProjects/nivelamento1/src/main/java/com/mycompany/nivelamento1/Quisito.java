package com.mycompany.nivelamento1;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Quisito {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Double valorBolsa1 = 25.12;
        Double valorBolsa2 = 15.88;
        Double valorBolsa3 = 12.44;
        
        Double totalBolsa = valorBolsa1 + valorBolsa2 + valorBolsa3;
        
        System.out.println("Quantos filhos de 0 a 3 anos você possui? ");
        Integer qtdFilhos1 = leitor.nextInt();
        
        System.out.println("Quantos filhos de 4 a 16 anos você possui? ");
        Integer qtdFilhos2 = leitor.nextInt();
        
        System.out.println("Quantos filhos de 17 a 18 anos você possui? ");
        Integer qtdFilhos3 = leitor.nextInt();
        
        Integer filhosTotais = qtdFilhos1 + qtdFilhos2 + qtdFilhos3;
        
        if(qtdFilhos1 >= 1){
            
            Double result1 = valorBolsa1 * qtdFilhos1;
        }
        
        if(qtdFilhos2 >= 1){
            
            Double result2 = valorBolsa2 * qtdFilhos2;
        }
        
        if(qtdFilhos3 >= 1){
            
            Double result3 = valorBolsa3 * qtdFilhos3;
        }
        
        Double tudo = totalBolsa * filhosTotais;
        
        System.out.println(String.format("Você tem um total de %d filhos e vai receber R$ %.2f de bolsa",
                filhosTotais, tudo));
    }
}
