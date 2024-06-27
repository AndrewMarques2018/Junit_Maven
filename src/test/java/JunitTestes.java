import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitTestes {

    @Test
    void ValidarStrings() {
        String a = "Andrew";
        String b = "Andrew 2";

        // Assertions.assertEquals(a, b);
        Assertions.assertNotEquals(a, b);
    }

    @Test
    void ValidarListas() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 4};

        // Assertions.assertArrayEquals(a, b);
        Assertions.assertNotEquals(a, b);
    }

    @Test
    void ValidarNull() {
        String a = null;

        Assertions.assertNull(a);
        // Assertions.assertNotNull(a);
    }
}
