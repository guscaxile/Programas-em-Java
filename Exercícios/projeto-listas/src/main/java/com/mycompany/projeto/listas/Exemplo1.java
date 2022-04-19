package com.mycompany.projeto.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exemplo1 {

    public static void main(String[] args) {

        //Sintaxe para descrever um vetor em Java
        //Integer[] inteiros = new Integer[10];
        //String[] nomes = new String[5];
        //Integer tamanho = inteiros.length;
        //List listaLoca = new ArrayList();
        //listaLoca.add(10);
        //listaLoca.add("Diego");
        //listaLoca.add(1.83);
        //listaLoca.add(true);
        //System.out.println(listaLoca);
        //List<Integer> inteiros = new ArrayList();
        //inteiros.add(1);
        List<String> frutas = new ArrayList();

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Pêra");
        frutas.add("Abacaxi");
        frutas.add("Manga");

        System.out.println(frutas);

        frutas.remove(0);

        System.out.println("\nDepois do remove");
        System.out.println(frutas);

        frutas.set(0, "Amora");

        System.out.println("\nDepois do SET");
        System.out.println(frutas);

        frutas.add(0, "Jaca");

        System.out.println("\nDepois do add com índice");
        System.out.println(frutas);

        System.out.println("\nDepois do SIZE");
        System.out.println(frutas.size());

        System.out.println("ITERANDO COM CLÁSSICO");
        for (Integer i = 0; i < frutas.size(); i++) {

            System.out.println("Fruta: " + frutas.get(i));
        }

        System.out.println("ITERANDO COM  ENHANCED");

        for (Iterator<String> iterator = frutas.iterator(); iterator.hasNext();) {

            String next = iterator.next();
        }
    }
}

//VETOR EM JAVA: POSSUEM TAMANHO FIXO
