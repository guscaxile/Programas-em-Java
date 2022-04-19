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
public class Operadores {
    
    public static void main(String[] args) {
        
        /*
            Em Java, os operadores aritméticos são os mesmos do JavaScript <3
            São eles:
            + adição
            - subtração
            * multiplicação
            / divisão
        */
        
        Integer numero1 = 40;
        Integer numero2 = 10;
        
        Integer resultadoSoma = numero1 + numero2;
        
//        System.out.println(resultadoSoma);
        
        /*
            ++ incrementar
            -- decrementar
        
            numero1 += 1;
            numero1 ++ 1;
            numero1 *= 1;
            numero1 == 1;
        */
        
        Integer numeroParaTeste = 42;
        numeroParaTeste++;
        
//        System.out.println(numeroParaTeste);
        
        Scanner leitor = new Scanner(System.in);
    }
}
