package core.logging;

public class DatabaseLogger implements BaseLogger{
    @Override
    public void log(String name) {
        System.out.println("Veritabanı loglandı.");
    }
}
