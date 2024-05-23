class Menu {
    String name;
    Menu(String name) {
        if (name == null || name.isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }
}
public class Lab8_1 {
    public static void main(String[] args) {
        Menu[] menus = {
                new Menu("Pork Belly"),
                new Menu("Fish and Chips"),
                new Menu(""),
                new Menu("Beef Wellington"),
                new Menu(null)
        };
        for (Menu menu : menus) {
            System.out.println(menu.name);
        }
    }
}