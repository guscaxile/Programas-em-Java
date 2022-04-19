package VistoEmAula;

public class Interpolacao {

    public static void main(String[] args) {
        
        String nome = "Gustavo";
        Integer idade = 21;
        Double altura = 1.90;
        
        String frase = String.format("Meu nome é %s, tenho %d anos e %.2f m de altura", 
                nome, idade, altura);
        
        System.out.println(frase);
    }
}
