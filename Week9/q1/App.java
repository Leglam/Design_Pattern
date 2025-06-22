public class App {
    public static void main(String[] args) {
        IImage myImage = new Image("test.jpg");
        IImage myImage2 = new ProxyImage("Proxytest.jpg");  
        //do something
        System.out.println("Wait for 5 seconds");
        try { //เช็คเล่นครับว่าทำงานทีหลังจริง
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myImage.display();        
        myImage2.display();  
    }
}
