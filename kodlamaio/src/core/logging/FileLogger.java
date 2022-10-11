package core.logging;

public class FileLogger implements BaseLogger {
    @Override
    public void log(String name) {

        System.out.println("Dosyaya loglandı.");
    }
}
