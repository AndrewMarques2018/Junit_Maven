package Mockito;

public class EmailService {

    public void sendEmail(String recipient, String message) {
        // Simulação do envio de email
        System.out.println("Enviando email para: " + recipient);
        System.out.println("Mensagem: " + message);
    }
}

