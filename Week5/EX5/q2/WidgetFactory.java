public class WidgetFactory {
  public static IWidgetFactory createWidget(String widgetType) {
    switch (widgetType) {
      case "PM":
        return PMWidgetFactory.getMotifWidgetFactory();
      case "Motif":
        return MotifWidgetFactory.getMotifWidgetFactory();
      default:
        return null;
    }
  }
}
