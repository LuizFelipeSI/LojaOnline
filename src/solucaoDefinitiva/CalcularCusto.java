package solucaoDefinitiva;

public class CalcularCusto {

    public double calcular(TipoEnvio tipo, Produto produto) {
        return tipo.calcular(produto);
    }
}
