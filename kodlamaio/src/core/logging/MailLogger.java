package core.logging;

public class MailLogger implements BaseLogger{
    @Override
    public void log(String name) {
        System.out.println("Mail loglandı.");
    }
}
