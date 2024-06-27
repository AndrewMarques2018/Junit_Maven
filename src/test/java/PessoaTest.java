import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void ValidarGetIdade() {
        Pessoa andrew = new Pessoa("Andrew", LocalDate.of(2000, 4, 8));
        Assertions.assertEquals(24, andrew.getIdade());
    }
}
