import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    private Logger nextLogger;

    @Override
    public void setNext(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    @Override
    public void logMessage(LogLevel level, String message) {
        if (level == LogLevel.DEBUG || level == LogLevel.ERROR) {
            try (FileWriter writer = new FileWriter("log.txt", true)) {
                writer.write("File::Logger: " + message + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
}
