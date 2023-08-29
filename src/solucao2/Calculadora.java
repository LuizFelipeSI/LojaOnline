package solucao2;

public class Calculadora {

    public double calcular(Produto produto) {
        return produto.getTipoEnvio().getCalc().calcular(produto);
    }
}
