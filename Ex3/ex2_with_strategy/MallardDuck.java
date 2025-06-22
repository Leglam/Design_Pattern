public class MallardDuck extends Duck {
    public MallardDuck() {
        setHowToFly(new FlyWithWings());
        setHowToQuack(new Quack());
    }
    public void display() {
        System.out.println("I am Mallard Duck");
    }
}
