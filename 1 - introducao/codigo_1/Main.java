package codigo_1;

public class Main {
    public static void main(String[] args) {

        Fracao fracao1 = new Fracao();

        // Fracao 1
        fracao1.setNumerador(1);
        fracao1.setDenominador(2);

        Fracao fracao2 = new Fracao();
        // Fracao 2
        fracao2.setNumerador(2);
        fracao2.setDenominador(4);

        System.out.println(fracao1.multiplicaFracao(fracao1, fracao2));
        
    }
}
