public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        setHowToFly(new FlyWithWings());
        setHowToQuack(new Quack());
    }
    public void display() {
        System.out.println("I am Redhead Duck");
    }
}
