package solucaoDefinitiva;

public class PorPeso implements TipoEnvio {

    @Override
    public double calcular(Produto produto) {
        return produto.getPeso() * 2;
    }
}
