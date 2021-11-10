
package Lista03;

public class TesteExercicio02 {
    
    Double calcMedia(Double renda){
        
        return renda / 1100;
    }
    
    void exibirClasse(Double renda){
        
        if(renda > 20900.00){
            
            System.out.println("\n \n Você pertence á classe: A \n \n");
        }else if(renda > 10450.00 && renda < 20900.01){
            
            System.out.println("\n \n Você pertence á classe: B \n \n");
        }else if(renda > 4180.00 && renda < 10450.01){
            
            System.out.println("\n \n Você pertence á classe: C \n \n");
        }else if(renda > 2090.00 && renda < 4180.01){
            
            System.out.println("\n \n Você pertence á classe: D \n \n");
        }else{
            
            System.out.println("\n \n Você pertence á classe: E \n \n");
        }
    }
}
