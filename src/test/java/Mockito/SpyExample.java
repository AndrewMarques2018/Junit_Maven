package Mockito;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class SpyExample {

    @Test
    void testSpy() {
        List spyList = spy(new ArrayList<String>());
        spyList.add("one");
        spyList.add("two");

        verify(spyList).add("one");
        verify(spyList).add("two");
    }

    @Test
    void testInOrderVerification() {
        // Criação dos mocks
        List<String> mockedList = mock(List.class);

        // Utilizando mocks
        mockedList.add("one");
        mockedList.add("two");

        // Criação do objeto InOrder passando os mocks que precisam ser verificados na ordem
        InOrder inOrder = inOrder(mockedList);

        // Verificando a ordem das chamadas
        inOrder.verify(mockedList).add("one");
        inOrder.verify(mockedList).add("two");
    }

    @Test
    void testTimesVerification() {
        // Criação do mock
        List<String> mockedList = mock(List.class);

        // Utilizando o mock várias vezes
        mockedList.add("one");
        mockedList.add("two");
        mockedList.add("two");

        // Verificando quantas vezes um método foi chamado
        verify(mockedList, times(1)).add("one");
        verify(mockedList, times(2)).add("two");
    }
}
