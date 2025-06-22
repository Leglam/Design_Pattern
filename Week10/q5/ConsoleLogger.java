public class ConsoleLogger implements Logger {
  private Logger nextLogger;

  @Override
  public void setNext(Logger nextLogger) {
      this.nextLogger = nextLogger;
  }

  @Override
  public void logMessage(LogLevel level, String message) {
      if (level == LogLevel.INFO || level == LogLevel.DEBUG || level == LogLevel.ERROR) {
          System.out.println("Standard Console::Logger: " + message);
      }
      if (nextLogger != null) {
          nextLogger.logMessage(level, message);
      }
  }
}
