public class App {
    public static void main(String[] args) {
        FlyweightFormattedText myFormattedText = new FlyweightFormattedText("This is the house that Jack Built");
        myFormattedText.getRange(5, 6).setCapitalize(true);
        myFormattedText.getRange(12, 16).setCapitalize(true);
        System.out.println(myFormattedText.toString());      
    }    
}
