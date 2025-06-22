public abstract class Duck {
    private FlyBehavior howToFly;
    private QuackBehavior howToQuack;
    
    public void performQuack() {
        howToQuack.quack();
    }
    public void swim() {
        System.out.println("Happy to swim");
    }
    public void performFly() {
        howToFly.fly();
    }
    public void setHowToFly(FlyBehavior howToFly) {
        this.howToFly = howToFly;
    }
    public void setHowToQuack(QuackBehavior howToQuack) {
        this.howToQuack = howToQuack;
    }
    public abstract void display();
}
