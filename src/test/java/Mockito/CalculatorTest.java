package Mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

    @Mock
    private CalculatorService calculatorService;

    @Test
    void testAdditionWithMockObjects() {
        // Configurando o comportamento do mock para o método add()
        Mockito.when(calculatorService.add(2, 3)).thenReturn(5);

        // Utilizando o mock para testar a classe Calculator
        Calculator calculator = new Calculator(calculatorService);
        int result = calculator.add(2, 3);

        // Verificando o resultado usando o mock configurado
        Assertions.assertEquals(5, result);

        // Verificando se o método add() foi chamado corretamente com os parâmetros esperados
        Mockito.verify(calculatorService).add(2, 3);
    }

    @Test
    void testSubtractionWithMockObjects() {
        // Configurando o comportamento do mock para o método subtract()
        Mockito.when(calculatorService.subtract(5, 3)).thenReturn(2);

        // Utilizando o mock para testar a classe Calculator
        Calculator calculator = new Calculator(calculatorService);
        int result = calculator.subtract(5, 3);

        // Verificando o resultado usando o mock configurado
        Assertions.assertEquals(2, result);

        // Verificando se o método subtract() foi chamado corretamente com os parâmetros esperados
        Mockito.verify(calculatorService).subtract(5, 3);
    }
}
