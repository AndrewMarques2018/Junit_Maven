package Mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private EmailService emailServiceMock;

    @InjectMocks
    private UserService userService;

    @Captor
    private ArgumentCaptor<String> recipientCaptor;

    @Captor
    private ArgumentCaptor<String> messageCaptor;

    @Test
    void testSendEmail() {
        // Executando o método do serviço sob teste que envia o email
        userService.notifyUserByEmail("user@example.com", "Hello, User!");

        // Capturando os argumentos passados ao método sendEmail do mock
        verify(emailServiceMock).sendEmail(recipientCaptor.capture(), messageCaptor.capture());

        // Verificando os valores capturados
        String recipient = recipientCaptor.getValue();
        String message = messageCaptor.getValue();

        // Asserts para verificar os valores capturados
        Assertions.assertEquals("user@example.com", recipient);
        Assertions.assertEquals("Hello, User!", message);
    }
}
