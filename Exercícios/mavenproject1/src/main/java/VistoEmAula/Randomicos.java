package VistoEmAula;


import java.util.concurrent.ThreadLocalRandom;


public class Randomicos {
    
    public static void main(String[] args) {
        
        Integer numeroInteiroGerado = ThreadLocalRandom.current().nextInt(0, 100);
        
        System.out.println("Número gerado: " + numeroInteiroGerado);
    }
}
