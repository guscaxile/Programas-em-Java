package Lista02;

import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Integer numeroRandom;

        Integer contador = 0;

        Integer cont_par = 0;

        Integer cont_impar = 0;

        System.out.println("Digite um número de 1 a 100: ");

        Integer numeroDigitado = leitor.nextInt();

        Boolean primeiraVez = true;

        if (numeroDigitado <= 100 && numeroDigitado >= 1) {

            for (int i = 0; i < 200; i++) {

                numeroRandom = ThreadLocalRandom.current().nextInt(0, 100) + 1;

                System.out.println(numeroRandom);

                if (numeroRandom % 2 == 0) {
                    
                    cont_par++;
                } else {
                    
                    cont_impar++;
                }

                if (primeiraVez) {

                    if (!Objects.equals(numeroDigitado, numeroRandom)) {
                        contador++;
                    }

                    if (Objects.equals(numeroDigitado, numeroRandom)) {
                        primeiraVez = false;
                    }
                }

            }
        } else {
            System.out.println("Você digitou um número inválido");
        }
        System.out.println("Seu número foi sorteado na: " + (contador + 1) + "° vez");

        System.out.println("Foram sortados: " + cont_par + " números pares");

        System.out.println("Foram sortados: " + cont_impar + " números impares");
    }
}

//Crie uma classe chamada “Sorteio” que: 
//
//Solicite um número de 1 a 100.
//Realize 200 sorteios. 
//Ao final, exibir:
//    Quando o número foi sorteado (pela 1ª vez, apresente o número do sorteio).
//
//    Quantos números pares foram sorteados.
//
//    Quantos números ímpares foram sorteados
