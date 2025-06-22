public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setHowToFly(new FlyNoWay());
        setHowToQuack(new MuteQuack());
    }
    public void display() {
        System.out.println("I am Decoy Duck");
    }
    
}
