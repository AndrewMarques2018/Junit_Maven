import org.junit.jupiter.api.*;

public class BDTestes {

    @BeforeAll
    static void iniciarConexao() {
        BD.iniciarConexao();
    }

    @BeforeEach
    void insereDadosTeste() {
        BD.inserirDados("dados ...");
    }

    @AfterEach
    void removerDadosTeste() {
        BD.removerDados("dados ...");
    }

    @Test
    void validarDadosRetorno() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao() {
        BD.finalizarConexao();
    }
}
