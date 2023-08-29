package solucao2;

public enum TipoEnvio {

    TAMANHO(new PorTamanho()),
    PESO(new PorPeso());

    private Calc calc;

    TipoEnvio(Calc calc) {
        this.calc = calc;
    }

    public Calc getCalc() {
        return calc;
    }

    public void setCalc(Calc calc) {
        this.calc = calc;
    }
}
