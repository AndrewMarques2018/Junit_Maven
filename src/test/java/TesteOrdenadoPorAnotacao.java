import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TesteOrdenadoPorAnotacao {

    @Test
    @Order(3)
    @DisplayName("Teste C - Último Teste")
    void testeC() {
        System.out.println("Executando Teste C");
    }

    @Test
    @Order(1)
    @DisplayName("Teste A - Primeiro Teste")
    void testeA() {
        System.out.println("Executando Teste A");
    }

    @Test
    @Order(2)
    @DisplayName("Teste B - Segundo Teste")
    void testeB() {
        System.out.println("Executando Teste B");
    }
}
