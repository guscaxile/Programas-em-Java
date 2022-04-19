
package Lista03;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        TesteExercicio04 metodo = new TesteExercicio04();
        
        System.out.println("Digite o valor unitário do produto: ");
        Double valorUnitario = leitor.nextDouble();
        
        System.out.println("Digite a quantidade de produtos: ");
        Double qtdProdutos = leitor.nextDouble();
        
        Double valorDesconto = metodo.calcularDesconto(valorUnitario, qtdProdutos);
        
        System.out.println(String.format("\n Valor do produto: R$ %.2f \n", valorUnitario));
        System.out.println(String.format("Quantidade: %.0f", qtdProdutos));
        System.out.println(String.format("\n Valor com desconto: R$ %.2f \n", valorDesconto));
    }
}

//Um supermercado criou promoção onde comprando 1 produto o desconto será de 
//10%, 2 produtos 20% e 3 ou mais produtos 30%. Para implementar o calculo 
//da promoção no sistema de caixa, crie uma classe chamada “DescontoProgressivo”, que:
//
//Solite o valor unitário de um determinado produto e a quantidade .
//Contenha um método chamado calcularDesconto, que recebe o valor e quantidade, 
//e retorna o valor final com desconto.
//Contenha um método chamado exibirNotaFiscal, que possui o seguinte retorno. 