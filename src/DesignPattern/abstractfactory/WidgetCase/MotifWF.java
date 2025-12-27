package designpatterns.abstractfactory.WidgetCase;

// implements the operations to create concrete product objects
public class MotifWF implements WidgetFactory {
    @Override
    public ScrollBar createScrollBar() {
        return new MotifScrollBar();
    }

    @Override
    public Window createWindow() {
        return new MotifWindow();
    }
}
