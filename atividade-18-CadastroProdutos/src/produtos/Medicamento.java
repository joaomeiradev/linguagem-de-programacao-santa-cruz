package produtos;

public class Medicamento {
    public String codigoBarras;
    public String nome;
    public String descricao;
    public String laboratorio;
    public double precoCusto;
    public boolean controlado;
    public int quantidadeEstoque;

    public Medicamento (String codigoBarras, String nome, String descricao, String laboratorio, double precoCusto, boolean controlado, int quantidadeEstoque) {
        this.codigoBarras = codigoBarras;
        this.nome = nome;
        this.descricao = descricao;
        this.laboratorio = laboratorio;
        this.precoCusto = precoCusto;
        this.controlado = controlado;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPrecoVenda(){
        return precoCusto + (precoCusto * 0.33);
    }

    public void exibirInformacoes(){
        System.out.println("Código de barras: " + codigoBarras);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Laboratório: " + laboratorio);
        System.out.printf("Preço de custo: R$ %.2f\n", precoCusto);
        System.out.printf("Preço de venda: R$ %.2f\n", getPrecoVenda());
        System.out.println("Controlado: " + (controlado ? "Sim" : "Não"));
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }

    public void atualizarEstoque(int novaQuantidade){
        if (novaQuantidade >= 0){
            this.quantidadeEstoque = novaQuantidade;
            System.out.println("Estoque atualizado com sucesso!");
        }
        else {
            System.out.println("Quantidade inválida. Estoque não pode ser negativo.");
        }
    }
}
