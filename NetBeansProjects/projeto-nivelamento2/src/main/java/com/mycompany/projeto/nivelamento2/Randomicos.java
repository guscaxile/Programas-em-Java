package com.mycompany.projeto.nivelamento2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author gustavo
 */
public class Randomicos {
    
    public static void main(String[] args) {
        
        //Random aleatorios = new Random();
        
        //Double numeroGerado = aleatorios.nextDouble();
        
        //System.out.println("Nímero: " + numeroGerado);

        Integer numeroInteiro = ThreadLocalRandom.current().nextInt(0, 11);
        
        //Integer numeroConvertido = Integer.valueOf("10");
    }
}
