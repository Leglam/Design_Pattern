public class ErrorLogger implements Logger {
  private Logger nextLogger;

  @Override
  public void setNext(Logger nextLogger) {
      this.nextLogger = nextLogger;
  }

  @Override
  public void logMessage(LogLevel level, String message) {
      if (level == LogLevel.ERROR) {
          System.out.println("Error Console::Logger: " + message);
      }
      if (nextLogger != null) {
          nextLogger.logMessage(level, message);
      }
  }
}
