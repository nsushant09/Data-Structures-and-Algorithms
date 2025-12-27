package designpatterns.singleton.choc_o_holic;

import Kushwaha.OOP.ForSingleton.Singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler instance = null;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isBoiled() {
        return boiled;
    }

    public boolean isEmpty() {
        return empty;
    }

    /**
     * Use the simple Singleton when only one thread will be making use of getInstance()
     * static ChocolateBoiler getInstance() {
     * if (instance == null) {
     * instance = new ChocolateBoiler();
     * }
     * return instance;
     * }
     **/

    /**
     * Use eagerly instance if your application always create and uses an instance of the singleton
     * <p>
     * private static ChocolateBoiler instance = new ChocolateBoiler();
     * static ChocolateBoiler getInstance() {
     * if (instance == null) {
     * instance = new ChocolateBoiler();
     * }
     * return instance;
     * }
     **/


//    Use double-checked locking to reduce the use of synchronization with getInstance()
    static synchronized ChocolateBoiler getInstance() {
        if (instance == null) {
            synchronized (ChocolateBoiler.class) {
                if (instance == null) {
                    instance = new ChocolateBoiler();
                }
            }
        }
        return instance;
    }


}
