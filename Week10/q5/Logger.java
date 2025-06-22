public interface Logger {
  void setNext(Logger nextLogger);  // Set the next handler in the chain
  void logMessage(LogLevel level, String message);  // Process the log message
}
