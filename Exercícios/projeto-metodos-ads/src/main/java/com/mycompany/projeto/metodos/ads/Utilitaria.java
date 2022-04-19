package com.mycompany.projeto.metodos.ads;

public class Utilitaria {

    //  Assinatura do método
    //  modificador de acesso: delimita quem pode acessar o método
    //  tipo de retorno: identifica o que o método devolve(se devolve)
    //  nome do método: identificador, ex: exibirLinha
    void exibirLinha() {

        System.out.println("----------------");
    }
    
    void exibirNome(String nomeQualquer) {

        System.out.println(String.format("Meu nome: %s", nomeQualquer));
    }

//    void exibirDecorado(String nome) {
//        
//        exibirLinha();
//        exibirNome(nome);
//        exibirLinha();
//    }
}
