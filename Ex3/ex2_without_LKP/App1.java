public class App1 {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        show(mallardDuck);
        Duck redHeadDuck = new MallardDuck();
        show(redHeadDuck);
        Duck rubberDuck = new RubberDuck1();
        show(rubberDuck);
        Duck decoyDuck = new DecoyDuck();
        show(decoyDuck);
    }
    public static void show(Duck duck) {
        duck.display();
        if (!(duck instanceof DecoyDuck)) {
            duck.quack();
        }
        duck.swim();
        //duck.fly();
        if (!(duck instanceof RubberDuck1 || duck instanceof DecoyDuck)) { 
            duck.fly();
        }
    }
}
