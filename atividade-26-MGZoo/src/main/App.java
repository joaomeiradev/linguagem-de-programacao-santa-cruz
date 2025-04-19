package main;

import services.*;

public class App {
    public static void main(String[] args) {
        Animal generico = new Animal("Animal Genérico", 5, 15.0f);
        Mamifero leao = new Mamifero("Leão", 7, 190.0f, 80.0f);
        Ave arara = new Ave("Arara", 3, 1.5f, 1.2f);
        Reptil jacare = new Reptil("Jacaré", 10, 250.0f, 30.0f);

        generico.fazerSom();
        generico.exibirInformacoes();

        leao.fazerSom();
        leao.exibirInformacoes();

        arara.fazerSom();
        arara.exibirInformacoes();

        jacare.fazerSom();
        jacare.exibirInformacoes();

        Cachorro dog = new Cachorro("Bolt", 4, 20.0f, 45.0f);
        Papagaio papagaio = new Papagaio("Louro", 2, 0.9f, 0.6f);
        Cobra cobra = new Cobra("Naja", 5, 5.0f, 28.5f);

        dog.fazerSom();
        dog.correr();

        papagaio.fazerSom();
        papagaio.voar();

        cobra.fazerSom();
        cobra.rastejar();
    }
}
