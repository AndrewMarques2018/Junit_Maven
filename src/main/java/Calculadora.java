public class Calculadora {
    public int dividir(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return numerador / denominador;
    }
}
