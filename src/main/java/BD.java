import java.util.logging.Logger;

public class BD {

    private static final Logger LOGGER = Logger.getLogger(BD.class.getName());
    public static void iniciarConexao() {
        LOGGER.info("Iniciou a conexão");
    }

    public static void finalizarConexao() {
        LOGGER.info("Finalizou a conexão");
    }

    public static void inserirDados(String dados) {
        LOGGER.info("Inseriu os Dados");
    }
    public static void removerDados(String dados) {
        LOGGER.info("Removeu os Dados");
    }
}
