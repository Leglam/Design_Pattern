import java.util.*;

public class SOLID_O {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL, Price.LOW);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE, Price.MEDIUM);
        Product house = new Product("House", Color.BLUE, Size.LARGE, Price.HIGH);
        Product car = new Product("Car", Color.BLUE, Size.MEDIUM, Price.HIGH);

        List<Product> products = List.of(apple, tree, house, car);

        ProductFilter pf = new ProductFilter();
        System.out.println("Green products: (new)");
        pf.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(" - " + p.name + " is green"));
        System.out.println("Small products: (new)");
        pf.filter(products, new SizeSpecification(Size.SMALL))
                .forEach(p -> System.out.println(" - " + p.name + " is small"));
        System.out.println("High price products: (new)");
        pf.filter(products, new PriceSpecification(Price.HIGH))
                .forEach(p -> System.out.println(" - " + p.name + " is high price"));

        System.out.println("Blue AND Large products: (new)");
        pf.filter(products,
                new AndSpecification<Product>(
                        new ColorSpecification(Color.BLUE),
                        new SizeSpecification(Size.LARGE)))
                .forEach(p -> System.out.println(" - " + p.name + " is blue and large"));
        System.out.println("Blue AND Medium AND High products: (new)");
        pf.filter(products,
                new AndSpecification<Product>(
                        new ColorSpecification(Color.BLUE),
                        new SizeSpecification(Size.MEDIUM), new PriceSpecification(Price.HIGH)))
                .forEach(p -> System.out.println(" - " + p.name + " is blue and medium and high"));
    }
}