package Mockito;

public class UserService {

    private EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void notifyUserByEmail(String recipient, String message) {
        emailService.sendEmail(recipient, message);
    }
}
