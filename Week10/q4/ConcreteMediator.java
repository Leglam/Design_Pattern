import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator implements Mediator {
    private Map<String, Device> devices = new HashMap<>();

    @Override
    public void registerDevice(String deviceName, Device device) {
        devices.put(deviceName, device);
        device.setMediator(this);
    }

    @Override
    public void notify(String event, Device device) {
        if ("task_done".equals(event)) {
            devices.get("sprinkler").doTask();
        } else if ("coffeePot_task".equals(event)) {
            devices.get("coffeePot").doTask();
        } else {
            System.out.println("Unknown event: " + event);
        }
    }
}
