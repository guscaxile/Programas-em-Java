package Lista04;

public class TesteExercicio02 {

    String nome;
    String cargo;
    Double salario;
    
    void reajustarSalario(Integer reajuste){
        
        salario = salario + (salario * reajuste) / 100;
    }
}

//Crie uma classe chamada Empregado com os atributos nome, cargo e salario. 
//
//Crie um método chamado reajustarSalario, que receberá como parâmetro a 
//porcentagem do reajuste, e atualiza o atributo salario.
//
//Crie uma classe de teste chamada TesteEmpregado. 
//
//Dentro do método main, instancie um objeto da classe Empregado que tenha 
//como nome “João”, salário inicial de R$ 5.400,00 e cargo “Analista de Sistemas”.
//Imprima na tela o nome, o cargo e o salário reajustado, sabendo que este 
//empregado recebeu um reajuste salarial de 15%. 
//Crie outro objeto da classe Empregado e forneça atributos de sua escolha. 
//Depois imprima seus dados e também seu salário reajustado.