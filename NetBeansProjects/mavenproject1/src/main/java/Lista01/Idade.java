
package Lista01;

import java.util.Scanner;

public class Idade {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o seu nome:");
        String nome = leitor.next();
        
        System.out.println(String.format("Olá, %s. Qual o ano de seu nascimento?", nome));
        Double anoNascimento = leitor.nextDouble();
        
        Double idade = 2035 - anoNascimento;
        
        System.out.println(String.format("Em 2030 você terá %.0f anos", idade));
    }
}
