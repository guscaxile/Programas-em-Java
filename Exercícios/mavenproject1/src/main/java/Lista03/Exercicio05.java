
package Lista03;

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o seu sexo? M ou F");
        String sexo = leitor.next();
        
        System.out.println("Digite a sua altura: ");
        Double altura = leitor.nextDouble();
    }
}

//Escreva o método calculaPesoIdeal, que recebe o sexo (caractere ‘M’ ou ‘F’) e a altura de uma pessoa (em metros). 
//
//Este método deverá calcular e exibir o peso ideal dessa pessoa. 
//Escreva também o método main, que solicita que o usuário digite os valores  
//A fórmula para calcular o peso ideal é:
//correspondentes a pessoas diferentes e chame o método calculaPesoIdeal para exibir o peso ideal de cada uma delas.
//Para mulheres: (62.1 * altura) – 44.7
//Para homens: (72.7 * altura) - 58