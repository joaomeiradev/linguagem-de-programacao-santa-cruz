package services;

public class Nota {
    private double valorNota;
    private String descricao;

    public Nota(double valorNota, String descricao) {
        this.valorNota = valorNota;
        this.descricao = descricao;
    }

    public double getValorNota() {
        return valorNota;
    }

    public void setValorNota(double valorNota) {
        this.valorNota = valorNota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

