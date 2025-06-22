public class DecoyDuck extends Duck {
    public void display() {
        System.out.println("I am Decoy Duck");
    }
    public void quack() {
        throw new Error("decoy duck cannot quack");
    }
    public void fly() {
        throw new Error("decoy duck cannot fly");
    }
}
