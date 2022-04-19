package VistoEmAula;


import java.util.Scanner;


public class Operador2 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Gigite o ranking (1, 2 e 3) :");
        
        Integer ranking = leitor.nextInt();
        
        switch(ranking){
            
            case 1:
                
                System.out.println("Ganhou o MacBook PRO!");                
            case 2:
                
                System.out.println("Ganhou o iPhone 12!");                
            case 3:
                
                System.out.println("Ganihou uma viagem para Floripa.");
                break;
            default:
                
                
        }
    }
}
