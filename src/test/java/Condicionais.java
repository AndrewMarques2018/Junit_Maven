import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class Condicionais {

    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "Andrew")
    void deveExecutarSeUsuarioForAndrew() {
        System.out.println("Este teste roda somente se o usuário for Andrew");
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USERNAME", matches = "Andrew")
    void naoDeveExecutarSeUsuarioForAndrew() {
        System.out.println("Este teste não roda se o usuário for Andrew");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void deveExecutarSomenteNoWindows() {
        System.out.println("Este teste roda somente no Windows");
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void deveExecutarSomenteNoMac() {
        System.out.println("Este teste roda somente no Mac");
    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.MAC})
    void deveExecutarSomenteNoLinuxOuMac() {
        System.out.println("Este teste roda somente no Linux ou no Mac");
    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    void naoDeveExecutarNoWindows() {
        System.out.println("Este teste não roda no Windows");
    }

    @Test
    @EnabledIfSystemProperty(named = "java.version", matches = "22.*")
    void deveExecutarSeVersaoJavaFor22() {
        System.out.println("Este teste roda somente se a versão do Java for 22");
    }
}
