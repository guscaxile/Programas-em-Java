
package Lista03;

public class TesteExercicio04 {
    
    Double calcularDesconto (Double valorUnitario, Double qtdProdutos){
        
        Double valorTotal = valorUnitario * qtdProdutos;    
        
        if(qtdProdutos >= 3){
            
            return valorTotal * 0.7;
        }else if(qtdProdutos >= 2 && qtdProdutos < 3){
            
            return valorTotal * 0.8;
        }else{
            
            return valorTotal * 0.9;
        }
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