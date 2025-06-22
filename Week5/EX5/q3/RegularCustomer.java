//make this class a subclass of customer
public class RegularCustomer extends Customer {
    @Override
    public String createMail() {
        return "Regular Customer Mail";
    }

    @Override
    public String sendBrochure() {
        return "Regular Customer Brochure";
    }
    
}
