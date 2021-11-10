package VistoEmAula;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gustavo.caxile
 */
public class Calculadora {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        Double primeiroNumero = leitor.nextDouble();

        System.out.println("Digite o 2º número: ");
        Double segundoNumero = leitor.nextDouble();

        Double soma = primeiroNumero + segundoNumero;
        Double subtracao = primeiroNumero - segundoNumero;
        Double multiplicacao = primeiroNumero * segundoNumero;
        Double divisao = primeiroNumero / segundoNumero;

        System.out.println(String.format("Soma: %.0f", soma));
        System.out.println(String.format("Subtração: %.0f", subtracao));
        System.out.println(String.format("Multiplicação: %.0f", multiplicacao));

        if (segundoNumero != 0 && primeiroNumero != 0) {

            System.out.println(String.format("Divisão: %.0f", divisao));
        } else {

            System.out.println("Não é possível dividir por 0!");
        }
    }

//        System.out.println("Subtração" + primeiroNumero + " - " 
//                + segundoNumero + " = " + (primeiroNumero - segundoNumero));
//        
//        System.out.println("Multiplicação" + primeiroNumero + " x " 
//                + segundoNumero + " = " + (primeiroNumero * segundoNumero));
//        
//        System.out.println("Divisão" + primeiroNumero + " % " 
//                + segundoNumero + " = " + (primeiroNumero / segundoNumero));
}