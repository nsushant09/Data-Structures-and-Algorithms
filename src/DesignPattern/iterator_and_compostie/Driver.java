package designpatterns.iterator_and_compostie;

public class Driver {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Description");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Description");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "Description");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Description");

//        Items to pancakeHouseMenu
        pancakeHouseMenu.add(new MenuItem("K&B Pancake Breakfast", "Veggie", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Egg", false, 3.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancake Breakfast", "Blueberry", true, 4.99));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Choco", true, 1.99));

//        Items to dinerMenu

        dinerMenu.add(new MenuItem("Diner Menu's K&B Pancake Breakfast", "Veggie", true, 2.99));
        dinerMenu.add(new MenuItem("Diner Menu's Regular Pancake Breakfast", "Egg", false, 3.99));
        dinerMenu.add(new MenuItem("Diner Menu's Blueberry Pancake Breakfast", "Blueberry", true, 4.99));
        dinerMenu.add(new MenuItem("Diner Menu's Waffles", "Choco", true, 1.99));

//        Items to cafeMenu

        cafeMenu.add(new MenuItem("Cafe Menu's K&B Pancake Breakfast", "Veggie", true, 2.99));
        cafeMenu.add(new MenuItem("Cafe Menu's Regular Pancake Breakfast", "Egg", false, 3.99));
        cafeMenu.add(new MenuItem("Cafe Menu's Blueberry Pancake Breakfast", "Blueberry", true, 4.99));
        cafeMenu.add(new MenuItem("Cafe Menu's Waffles", "Choco", true, 1.99));

//        Items to Dessert Menu
        dessertMenu.add(new MenuItem("Cake", "Veggie", true, 5.99));
//        Add Dessert Menu to dinerMenu
        dinerMenu.add(dessertMenu);


        MenuComponent[] allMenus = {pancakeHouseMenu, dinerMenu, cafeMenu};
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
