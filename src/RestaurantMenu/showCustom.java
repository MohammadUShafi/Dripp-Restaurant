package RestaurantMenu;
import java.io.IOException;

public interface showCustom {
    void showFlavor(String[] a_flavor); //output flavors
    void selectFlavor() throws IOException; //select flavors
    void showTopping(String[] a_topping); //output toppings
    void selectTopping() throws IOException; //select toppings
    void show_Cup_Cone(); //output cup/cone
    void select_Cup_Cone() throws IOException; //select cup/cone
}

