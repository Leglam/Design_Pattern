public class App {
    public static void main(String[] args) {
        FormattedText myFormattedText = new FormattedText("This is the house that Jack Built");
        myFormattedText.capitalize(5, 6);
        System.out.println(myFormattedText.toString());      
    }    
}
