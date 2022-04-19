package com.mycompany.javaencapsulamento;

public class TestePokemon {

    public static void main(String[] args) {

        Pokemon pokemon1 = new Pokemon("Charmander", "Fogo", 20.0);
        Pokemon pokemon2 = new Pokemon("Squirtle", "Água", 16.0);

        TreinadorPokemon treinador = new TreinadorPokemon("Gustavo Caxilé");

        treinador.treinarPokemon(pokemon1);
        treinador.treinarPokemon(pokemon1);
        treinador.treinarPokemon(pokemon1);
        treinador.treinarPokemon(pokemon1);
        treinador.treinarPokemon(pokemon1);

        System.out.println(pokemon1);

        treinador.evoluirPokemon(pokemon1, "Charizard");

        treinador.treinarPokemon(pokemon2);
        treinador.treinarPokemon(pokemon2);
        treinador.treinarPokemon(pokemon2);
        treinador.treinarPokemon(pokemon2);
        treinador.treinarPokemon(pokemon2);

        System.out.println(pokemon2);

        treinador.evoluirPokemon(pokemon2, "Blastoise");
    }
}
