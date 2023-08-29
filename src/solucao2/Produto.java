package solucao2;

public class Produto {

    private Double tamanho;
    private Double peso;

    private TipoEnvio tipoEnvio;

    public Produto() {
    }

    public Produto(Double tamanho, Double peso, TipoEnvio tipoEnvio) {
        this.tamanho = tamanho;
        this.peso = peso;
        this.tipoEnvio = tipoEnvio;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }
}
