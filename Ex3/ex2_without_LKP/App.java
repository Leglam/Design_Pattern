public class App {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        show(mallardDuck);
        Duck redHeadDuck = new RedHeadDuck();
        show(redHeadDuck);
        Duck rubberDuck = new RubberDuck();
        show(rubberDuck);
        //Duck decoyDuck = new DecoyDuck();
        //show(decoyDuck);
    }
    public static void show(Duck duck) {
        duck.display();
        duck.quack();
        duck.swim();
        duck.fly();
    }
}
