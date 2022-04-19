
package Lista03;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        TesteExercicio03 calc = new TesteExercicio03();
        
        System.out.println("Digite a sua idade: ");
        Integer idade = leitor.nextInt();
        
        calc.exibirClasse(idade);
    }
}

//Escreva o método classificaIdade (que não retorna nada) que recebe uma idade 
//e imprime uma mensagem conforme a faixa etária à qual pertence a idade conforme regra abaixo:
//
//0 a 2 anos - “Bebê”
//3 a 11 anos - “Criança”
//12 a 19 anos - “Adolescente”
//20 a 30 anos - “Jovem”
//31 a 60 anos - “Adulto”
//acima de 60 anos - “Idoso”.
//Escreva o método main que solicita que o usuário digite a sua idade, e que chama esse método, para testá-lo.