
package Lista03;

public class TesteExercicio03 {
    
    void exibirClasse(Integer idade){
        
        if(idade > 60){
            
            System.out.println("\n \n Idoso \n \n");
        }else if(idade >= 31 && idade < 60){
            
            System.out.println("\n \n Adulto \n \n");
        }else if(idade >= 20 && idade < 30){
            
            System.out.println("\n \n Jovem \n \n");
        }else if(idade >= 12 && idade < 19){
            
            System.out.println("\n \n Adolescente \n \n");
        }else if(idade >= 3 && idade < 11){
            
            System.out.println("\n \n Criança \n \n");
        }else{
            
            System.out.println("\n \n Bebê \n \n");
        }
    }
}

//Escreva o método classificaIdade (que não retorna nada) que recebe uma idade 
//e imprime uma mensagem conforme a faixa etária à qual pertence a idade conforme regra abaixo:
//
//0 a 2 anos - “Bebê”
//3 a 11 anos - “Criança”
//12 a 19 anos - “Adolescente”
//20 a 30 anos - “Jovem”
//31 a 60 anos - “Adulto”
//acima de 60 anos - “Idoso”.
//Escreva o método main que solicita que o usuário digite a sua idade, e que chama esse método, para testá-lo.