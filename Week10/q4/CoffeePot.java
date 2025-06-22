public class CoffeePot implements Device {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void doTask() {
        System.out.println("CoffeePot is doing its task!");
        mediator.notify("coffeePot_task_done", this); 
    }
}
