package solucaoDefinitiva;

public class Produto {

    private Double largura;
    private Double altura;
    private Double profundidade;
    private Double peso;
    private Double preco;

    public Produto() {
    }

    public Produto(Double largura, Double altura, Double profundidade, Double peso, Double preco) {
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
        this.peso = peso;
        this.preco = preco;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }
}
