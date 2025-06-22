public class LoggerFactory {
  public static Logger getLogger() {
      Logger consoleLogger = new ConsoleLogger();
      Logger fileLogger = new FileLogger();
      Logger errorLogger = new ErrorLogger();

      consoleLogger.setNext(fileLogger);
      fileLogger.setNext(errorLogger);

      return consoleLogger;
  }
}
