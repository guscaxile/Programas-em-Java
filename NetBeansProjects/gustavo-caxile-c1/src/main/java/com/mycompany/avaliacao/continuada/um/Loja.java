package com.mycompany.avaliacao.continuada.um;

import java.util.Scanner;

public class Loja {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        Integer escolherOpcao;
        Integer analiseOpcao;
        
        Integer produtosDesejados;

        System.out.println("Bem-vindo administrador! Faça o controle de metas e estoque:\n"
                + "Quantidade de produtos em estoque: ");
        Integer produtosEstoque = leitor.nextInt();

        System.out.println("Meta de vendas(%): ");
        Integer metaVendas = leitor.nextInt();

        Integer totalVendas = (produtosEstoque * metaVendas) / 100;

        System.out.println(String.format("Para atingir a meta, você precisa"
                + " vender %d produtos", totalVendas));

        System.out.println("Escolha os próximos passos:\n "
                + "1. Realizar venda\n"
                + "2. Sair\n");
        escolherOpcao = leitor.nextInt();
        
        switch(escolherOpcao){
            
            case 1:
                analiseOpcao = 1;
                break;
            
            case 2:
                analiseOpcao = 2;
                System.out.println("Até logo!");
            break;
            
            default:
                analiseOpcao = 0;
                System.out.println("Número inválido!");
                break;
        }while(!(analiseOpcao == 1 || analiseOpcao == 2));
        
        if(analiseOpcao == 1){
            
            System.out.println("Digite a quantidade de produtos desejados:");
            
            do {
                produtosDesejados = leitor.nextInt();
            
                if(produtosDesejados > produtosEstoque){
                
                    System.out.println(String.format("Infelizmente não temos a quantidade de produtos digitada.\n"
                            + "quantidade disponível: %d \n "
                            + "Digite uma quantidade válida: ", produtosEstoque));
                }else if(produtosDesejados == 0){
                    
                    System.out.println(String.format("Infelizmente não temos a quantidade de produtos digitada.\n"
                            + "quantidade disponível: %d \n "
                            + "Digite uma quantidade válida:", produtosEstoque));
                }
            }while(produtosDesejados > produtosEstoque);
            
            Integer qtdProdutos = produtosEstoque - produtosDesejados;
            Integer vendasDia = produtosEstoque - qtdProdutos;
            
            System.out.println(String.format("Venda do %dº produto registrada. "
                    + "Restam %d em estoque.", produtosDesejados, qtdProdutos));
            
            System.out.println(String.format("Você acabou de vender %d produtos"
                    + "(sua meta é %d)", vendasDia, metaVendas));
        }
    }
}