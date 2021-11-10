
package Lista01;

import java.util.Scanner;

public class CalculoMedia {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o seu nome:");
        String nome = leitor.next();
        
        System.out.println("Insira uma nota:");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Insira uma segunda nota:");
        Double nota2 = leitor.nextDouble();
        
        Double media = (nota1 + nota2) / 2;
        
        System.out.println(String.format("Olá, %s. Sua média foi de %.1f", nome, media));
    }
}

//Seja executável
//Solicite o nome e duas notas ao usuário.
//As notas são números reais.
//Calcule a média entre as notas (Dica: é da mesma forma como se faz em JavaScript)
//Exiba uma frase como esta: "Olá, NOME. Sua média foi de MEDIA"
//Use Interpolação com 1 casa decimal para a média.