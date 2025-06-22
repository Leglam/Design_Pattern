public class RubberDuck1 extends Duck {
    public void display() {
        System.out.println("I am Rubber Duck");
    }
    public void quack() { 
        System.out.println("Squeak Squeak");
    }
    //override to make this method does not work
    public void fly() throws Error { 
        throw new Error("rubber duck cannot fly");
    }
}
