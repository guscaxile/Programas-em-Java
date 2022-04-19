package Lista01;


import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o tempo (em minutos) que você passou se aquecendo:");
        Integer tempoAquecendo = leitor.nextInt();
        
        System.out.println("Informe o tempo (em minutos) que você fez exercícios aeróbicos:");
        Integer tempoAerobico = leitor.nextInt();
        
        System.out.println("Informe o tempo (em minutos) que você fez exercícios de musculação:");
        Integer tempoMusculacao = leitor.nextInt();
        
        Integer calculoAquecimento = tempoAquecendo * 12;
        Integer calculoAerobico = tempoAerobico * 20;
        Integer calculoMusculacao = tempoMusculacao * 25;
        
        Integer totalCalorias = calculoAquecimento + calculoAerobico + calculoMusculacao;
        Integer totalTempo = tempoAquecendo + tempoAerobico + tempoMusculacao;
        
        System.out.println(String.format("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias", totalTempo, totalCalorias));
    }
}
