public interface Mediator {
  void registerDevice(String deviceName, Device device);
  void notify(String event, Device device);
}