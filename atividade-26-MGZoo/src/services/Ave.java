package services;

public class Ave extends Animal {
    private float envergaduraAsas;

    public Ave(String nome, int idade, float peso, float envergaduraAsas) {
        super(nome, idade, peso);
        this.envergaduraAsas = envergaduraAsas;
    }

    @Override
    public void fazerSom() {
        System.out.println("som de uma ave");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Envergadura das asas: " + envergaduraAsas);
    }
}
