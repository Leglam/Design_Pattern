public class SugarDecorator extends Decorator {
  private int price = 1;

  public SugarDecorator(Beverage component) {
    super(component);
  }
  
  @Override
  public int getCost() {
    return super.getCost() + price;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + addSugar();
  }

  public String addSugar() {
    return "sugar ";
  }
}
