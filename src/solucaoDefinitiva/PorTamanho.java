package solucaoDefinitiva;

public class PorTamanho implements TipoEnvio {

    @Override
    public double calcular(Produto produto) {
        return produto.getAltura() * produto.getLargura();
    }
}
