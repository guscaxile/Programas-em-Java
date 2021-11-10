package VistoEmAula;


public class NovaCondicao {
    
    public static void main(String[] args) {
        
        String nome = "Diego";
        Boolean professor = true;
        
        System.out.println(String.format("Nome: %s\nÉ professor: %s", nome, (professor ? "SIM" : "NÃO")));
    }
}
