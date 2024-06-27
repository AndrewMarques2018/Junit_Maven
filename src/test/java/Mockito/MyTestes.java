package Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class MyTestes {

    @Mock
    private List<String> alfabeto;

    @Test
    void testeVerificacaoInteracao() {
        alfabeto.add("A");
        verify(alfabeto).add("A");
    }

    @Test
    void testeComportamentoVariosValores() {
        Mockito.when(alfabeto.get(0)).thenReturn("A");
        Mockito.when(alfabeto.get(1)).thenReturn("B");

        assertEquals("A", alfabeto.get(0));
        assertEquals("B", alfabeto.get(1));
    }

    @Test
    void testeException() {
        Mockito.when(alfabeto.get(0)).thenThrow(new RuntimeException("Erro de teste"));

        assertThrows(RuntimeException.class, () -> alfabeto.get(0));
    }

    @Test
    void testeNumeroInteracoes() {
        alfabeto.add("A");
        alfabeto.add("B");

        verify(alfabeto, times(1)).add("A");
        verify(alfabeto, times(1)).add("B");
    }

    @Test
    void testeMetodosVoid() {
        doNothing().when(alfabeto).clear();

        alfabeto.clear();
        verify(alfabeto, times(1)).clear();
    }

    @Test
    void testeStubbing() {
        Mockito.when(alfabeto.size()).thenReturn(10);

        assertEquals(10, alfabeto.size());
    }

    @Test
    void testCapturingArguments() {
        // Arrange
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

        // Act
        alfabeto.add("D");
        alfabeto.add("E");

        // Assert
        // Capture the arguments passed to the add method
        verify(alfabeto, Mockito.times(2)).add(argumentCaptor.capture());

        // Get all the captured values
        List<String> capturedArguments = argumentCaptor.getAllValues();

        // Verify the captured arguments
        assertEquals("D", capturedArguments.get(0));
        assertEquals("E", capturedArguments.get(1));
    }
}
