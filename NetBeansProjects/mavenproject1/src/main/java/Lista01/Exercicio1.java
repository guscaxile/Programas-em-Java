package Lista01;


import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o 1º número: ");
        Integer primeiroNumero = leitor.nextInt();

        System.out.println("Insira o 2º número");
        Integer segundoNumero = leitor.nextInt();

        Integer soma = primeiroNumero + segundoNumero;
        Integer subtracao = primeiroNumero - segundoNumero;
        Integer multiplicacao = primeiroNumero * segundoNumero;
        Integer divisao = primeiroNumero / segundoNumero;

        System.out.println("a Soma é: " + soma);
        System.out.println("a Subtração é: " + subtracao);
        System.out.println("a Multiplicação é: " + multiplicacao);
        System.out.println("a Divisão é: " + divisao);
    }
}
