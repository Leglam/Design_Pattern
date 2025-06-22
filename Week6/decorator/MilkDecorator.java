public class MilkDecorator extends Decorator {
  private int price = 3;

  public MilkDecorator(Beverage component) {
    super(component);
  }
  
  @Override
  public int getCost() {
    return super.getCost() + price;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + addMilk();
  }

  public String addMilk() {
    return "milk ";
  }
}
