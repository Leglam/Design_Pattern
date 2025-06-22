public class App {
    public static void main(String[] args) {
        LaptopRenderer laptop = new LaptopRenderer();
        SmartphoneRenderer smartphone = new SmartphoneRenderer();
        TVRenderer tv = new TVRenderer();
        ImageManager manager = new ImageManager(laptop);
		manager.show();
        manager.setRenderer(smartphone);
        manager.show();
        manager.setRenderer(tv);
        manager.show();
    }
}
