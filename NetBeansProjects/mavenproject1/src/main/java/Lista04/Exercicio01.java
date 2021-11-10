
package Lista04;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        TesteExercicio01 bolo1 = new TesteExercicio01();
        
        bolo1.sabor = "Chocolate";
        bolo1.valor = 50.0;
        
        TesteExercicio01 bolo2 = new TesteExercicio01();
         
        bolo2.sabor = "Morango";
        bolo2.valor = 40.0;
        
        TesteExercicio01 bolo3 = new TesteExercicio01();
        
        bolo3.sabor = "Abacaxi";
        bolo3.valor = 30.0;
        
        bolo1.comprarBolo(30);
        bolo2.comprarBolo(101);
        bolo3.comprarBolo(10);
        bolo1.comprarBolo(2);
        bolo3.comprarBolo(50);
        
        bolo1.exibirRelatorio();
        bolo2.exibirRelatorio();
        bolo3.exibirRelatorio();
    }
}

//A confeitaria da Dona Maria, precisa de um sistema para gestão dos bolos 
//vendidos em sua loja, que possibilite a geração de um relatório de vendas 
//para cada tipo de bolo, para implementação do sistema em Java com OO (orientação a objetos), crie: 
//
//1. Uma classe Bolo que contenha os atributos: 
//
//sabor (chocolate, morango ou abacaxi) 
//valor (entre 30.00 e 50.00) 
//quantidadeVendida (até 100 por dia) 
//A classe deve conter os seguintes métodos: 
//
//comprarBolo: recebe a quantidade desejada do bolo, e exibe a frase 
//"Seu pedido ultrapassou nosso limite diário para esse bolo." caso a 
//quantidade seja maior que 100, caso contrário, a quantidade de bolos vendidos deve ser atualizada. 
//exibirRelatorio: exibe a frase "O bolo sabor X, foi comprado Y vezes hoje, totalizando R$ Z"
//2. Crie uma classe executável chamada App, que: 
//
//Crie 3 bolos, com preço e sabor de sua preferência, 
//Compre pelo menos 5 vezes qualquer um dos bolos, 
//Exiba o relatório de cada um dos bolos criados.