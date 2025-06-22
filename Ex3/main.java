public class main {
  static void useIt(Rectangle r) {
    r.setHeight(10);
    System.out.println("Expected area = " + r.width * 10 + " , got " + r.getArea());
  }
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(20, 10);
    useIt(rectangle);

    Rectangle sq = new Rectangle(5);
    useIt(sq);
  }
}
