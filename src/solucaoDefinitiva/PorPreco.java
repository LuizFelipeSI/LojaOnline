package solucaoDefinitiva;

public class PorPreco implements TipoEnvio{

    @Override
    public double calcular(Produto produto) {
        if (produto.getPreco() > 500) {
            return 0;
        } else {
            return 20;
        }
    }
}
