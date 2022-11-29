public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao() {
        // construtor padrão
    }

    public Fracao(int numerador, int denominador) {
        setNumerador(numerador);
        setDenominador(denominador);
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return this.numerador;
    }

    public int getDenominador() {
        return this.denominador;
    }

    public double getValorReal() {
        return numerador/denominador;
    }

    public Fracao multiplicaFracao(Fracao f1, Fracao f2) {

        return new Fracao(
            f1.getNumerador() * f2.getNumerador(), 
            f1.getDenominador() * f2.getDenominador());
    }
}