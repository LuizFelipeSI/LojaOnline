package solucao2;

public class PorPeso implements Calc {

    @Override
    public double calcular(Produto produto) {
        return produto.getPeso() * 2;
    }
}
