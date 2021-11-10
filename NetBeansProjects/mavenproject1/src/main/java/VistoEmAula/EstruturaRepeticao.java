package VistoEmAula;


import java.util.Scanner;

public class EstruturaRepeticao {

    public static void main(String[] args) {

        System.out.println("Exemplo 01: for convencional");

        for (int i = 0; i < 10; i++) {

            System.out.println(String.format("Contador: %d", i));
        }

        System.out.println("Exemplo 02: percorrer ao contrário");

        for (int i = 10; i > 0; i--) {

            System.out.println(String.format("Contador: %d", i));
        }

        System.out.println("Exemplo 03: while");
        Scanner leitor = new Scanner(System.in);

        Integer numeroDigitado = leitor.nextInt();

        System.out.println("Digite 42: ");
        while (numeroDigitado != 42) {

            System.out.println("Essa não é a resposta!");
            numeroDigitado = leitor.nextInt();
        }
        System.out.println("Agora sim!");

        System.out.println("Exemplo 04: de 0 a 10 com while");
        Integer contador = 0;
        while (contador < 10) {

            System.out.println(String.format("Contador: %d", contador));
            contador++;
        }

        System.out.println("Exemplo 05: de 10  a 0");
        Integer contador2 = 10;
        while (contador2 == 0) {

            System.out.println(String.format("Contador: %d", contador2));
            contador2--;
        }

        //DO WHILE
        Scanner leitor2 = new Scanner(System.in);
        Integer numeroDigitado2;
    }
}