package designpatterns.abstractfactory.WidgetCase;

public class Driver {
    public static void main(String[] args) {
        boolean motif = false;

        WidgetFactory wf;

        if (motif) {
            wf = new MotifWF();
        } else {
            wf = new PMWF();
        }

        ScrollBar scrollBar = wf.createScrollBar();
        Window window = wf.createWindow();

        System.out.println(scrollBar);
        System.out.println(window);
    }
}
