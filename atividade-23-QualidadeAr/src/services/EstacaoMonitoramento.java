package services;

public class EstacaoMonitoramento {
    private String localizacao;
    private int indiceQualidadeAr;

    public EstacaoMonitoramento(String localizacao, int indiceQualidadeAr) {
        this.localizacao = localizacao;
        this.indiceQualidadeAr = indiceQualidadeAr;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getIndiceQualidadeAr() {
        return indiceQualidadeAr;
    }

    public void setIndiceQualidadeAr(int indiceQualidadeAr) {
        this.indiceQualidadeAr = indiceQualidadeAr;
    }
}
