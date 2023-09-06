package solucaoDefinitiva;

public class Main {

    public static void main(String[] args) {

        PorPeso pp = new PorPeso();
        PorTamanho pt = new PorTamanho();
        PorPreco ppr = new PorPreco();
        CalcularCusto cc = new CalcularCusto();
        Produto p = new Produto(10.0, 15.0, 12.0, 7.0, 550.0);

        System.out.println("por peso: " + cc.calcular(pp, p));
        System.out.println("por tamanho: " + cc.calcular(pt, p));
        System.out.println("por preço: " + cc.calcular(ppr, p));
    }
}
