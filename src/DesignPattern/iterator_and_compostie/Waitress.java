package designpatterns.iterator_and_compostie;

import java.util.Iterator;

public class Waitress {

    MenuComponent[] menuComponents;

    public Waitress(MenuComponent[] menuComponents) {
        this.menuComponents = menuComponents;
    }

    public void printMenu() {
        for (MenuComponent menu : menuComponents) {
            menu.print();
        }
    }
}
