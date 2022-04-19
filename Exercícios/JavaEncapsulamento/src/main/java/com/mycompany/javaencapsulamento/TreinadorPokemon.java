package com.mycompany.javaencapsulamento;

public class TreinadorPokemon {

    private String nome;
    private Integer nivel;

    public TreinadorPokemon(String nome) {
        this.nome = nome;
        this.nivel = 0;
    }

    public void treinarPokemon(Pokemon pokemonRecebido) {

        Double forcaAtual = pokemonRecebido.getForca();
        Integer qtdDocesAtual = pokemonRecebido.getDoces();

        pokemonRecebido.setForca(forcaAtual * 1.1);
        pokemonRecebido.setDoces(qtdDocesAtual + 10);

        this.nivel += 2;
    }

    public void evoluirPokemon(Pokemon pokemonRecebido, String evolucao) {

        if (pokemonRecebido.getDoces() >= 50) {

            String nomeAntigo = pokemonRecebido.getNome();

            pokemonRecebido.setNome(evolucao);
            pokemonRecebido.setDoces(pokemonRecebido.getDoces() - 50);

            this.nivel += 10;

            System.out.println(String.format("Pokémon %s evoluiu para -> %s",
                    nomeAntigo,
                    pokemonRecebido.getNome()
            ));
        } else {
            System.out.println("---Operação inválida---");
        }
    }
}
