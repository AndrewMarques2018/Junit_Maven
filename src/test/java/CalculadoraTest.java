import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    void deveLancarArithmeticExceptionQuandoDividirPorZero() {
        Calculadora calculadora = new Calculadora();

        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> calculadora.dividir(10, 0),
                "Esperava uma ArithmeticException ao dividir por zero."
        );

        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
    }
}
