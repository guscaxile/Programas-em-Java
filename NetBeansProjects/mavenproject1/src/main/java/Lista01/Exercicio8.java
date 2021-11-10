
package Lista01;

import java.util.Scanner;

public class Exercicio8 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual é o limite de peso do elevador?");
        Double pesoElevador = leitor.nextDouble();
        
        System.out.println("Qual é o limite de pessoas no elevador?");
        Integer pesoPessoas = leitor.nextInt();
        
        System.out.println("Qual é o peso da primeira pessoa?");
        Double primeiraPessoa = leitor.nextDouble();
        
        System.out.println("Qual é o peso da segunda pessoa?");
        Double segundaPessoa = leitor.nextDouble();
        
        System.out.println("Qual é o peso da terceira pessoa?");
        Double terceiraPessoa = leitor.nextDouble();
                
        Double pesoTotal = primeiraPessoa + segundaPessoa + terceiraPessoa;
        
        System.out.println(String.format
        ("Entraram 3 pessoas no elevador, no qual cabem %d pessoas. "
                + "O peso total no elevador é de %.0f, sendo que ele suporta %.0f", 
                pesoPessoas, pesoTotal, pesoElevador));
    }
}

//Seja executável.
//Solicite ao usuário o limite de peso de um elevador (número real).
//Solicite ao usuário o limite de pessoas em um elevador (número inteiro).
//Solicite ao usuário o peso da 1ª pessoa que entrou no elevador (número real).
//Solicite ao usuário o peso da 2ª pessoa que entrou no elevador (número real).
//Solicite ao usuário o peso da 3ª pessoa que entrou no elevador (número real). 
//Ao final, exiba uma frase assim: 
//"Entraram 3 pessoas no elevador, no qual cabem X pessoas.
//O peso total no elevador é de Y, sendo que ele suporta Z".
//(onde X é o 2º valor lido no programa, Z o 1º e Y é a soma dos pesos das 3 pessoas)