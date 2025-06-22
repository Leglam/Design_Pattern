public class RubberDuck extends Duck {
    public RubberDuck() {
        setHowToFly(new FlyNoWay());
        setHowToQuack(new Squeak());
    }
    public void display() {
        System.out.println("I am Rubber Duck");
    }
}
