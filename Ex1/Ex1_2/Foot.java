import java.util.Scanner;

public class Foot {
  private FootShape footShape;

  public Foot(FootShape footShape) {
    this.footShape = footShape;
  }

  public void draw(int footShapeNum) {
    switch (footShapeNum) {
      case 1:
        this.footShape.drawAsElipse();
        break;
      case 2:
        this.footShape.drawAsRectagle();
        break;
      default:
        System.out.println("Please Select Between 1 and 2");
        break;
    }
  }

  public static void main(String[] args) {
    FootShape footShape = new FootShape();
    Foot foot = new Foot(footShape);

    try {
      Scanner in = new Scanner(System.in);
      System.out.print("What to draw? 1.Elipse 2.Rectangle: ");
      int footShapeNum = in.nextInt();

      foot.draw(footShapeNum);
    } catch (Exception e) {
      System.err.println(e);
    }
  }
}
