package services;

public class Reptil extends Animal {
    private float temperaturaCorporal;

    public Reptil(String nome, int idade, float peso, float temperaturaCorporal) {
        super(nome, idade, peso);
        this.temperaturaCorporal = temperaturaCorporal;
    }

    @Override
    public void fazerSom() {
        System.out.println("som de um réptil");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Temperatura corporal: " + temperaturaCorporal);
    }
}
