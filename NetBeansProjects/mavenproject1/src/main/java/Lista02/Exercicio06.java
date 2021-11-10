package Lista02;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner leitor_B = new Scanner(System.in);

        Scanner leitor_E = new Scanner(System.in);

        System.out.println("Insira um valor para B: ");

        Integer numero_B = leitor_B.nextInt();

        System.out.println("Insira um valor para E: ");

        Integer numero_E = leitor_E.nextInt();

        /* Esse seria o jeito "certo":
        Integer resultado = (int) Math. pow (numero_B, numero_E); 
         */
        Integer result = numero_B * 1;

        for (int i = 1; i < numero_E; i++) {

            Integer result_for = result * numero_B;

            result = result_for;
        }

        System.out.println("B elevado a E " + "(" + numero_B + " elevado "
                + "a " + numero_E + ")" + " É igual a: " + result);
    }
}

//Elaborar um programa em Java que apresente como resultado o valor de uma 
//potência de uma base qualquer elevada a um expoente qualquer, ou seja, de BE, 
//em que B é o valor da base e E o valor do expoente.
//Considere apenas a entrada de valores inteiros e positivos.
//
//Por exemplo: B = 2 e E = 5.
//
//O programa deverá calcular e exibir o valor de 2 elevado a 5 = 32. 
//(Não é para usar métodos que calculam a potência diretamente).
