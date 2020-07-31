package RestaurantMenu;
import java.io.IOException;

public class Custom implements showCustom {
    protected String[] flavor; //hold flavor
    protected String[] topping; //hold topping

    public Custom(String[] f, String[] t) { //constructor
        flavor = f;
        topping = t;
    }

    //mutator
    public void setFlavor(String[] f) {flavor = f;}
    public void setTopping(String[] t) {topping = t;}

    //accessor
    public String[] getFlavor() {return flavor;}
    public String[] getTopping() {return topping;}

    public void showFlavor(String[] a_flavor) {

        System.out.println("You selected Create your Own!");
        System.out.println("Please select a flavor of your liking!");
        System.out.println();

        for (String i : a_flavor) System.out.println(i);
    }

    public void selectFlavor() throws IOException {

        char f_choice = (char) System.in.read();
        System.out.println();

        switch (f_choice) {
            case '1':
                System.out.println("You selected Vanilla!");
                break;
            case '2':
                System.out.println("You selected Chocolate!");
                break;
            case '3':
                System.out.println("You selected Cookies & Cream!");
                break;
            case '4':
                System.out.println("You selected Mint Chocolate Chip!");
                break;
            case '5':
                System.out.println("You selected Chocolate Chip Cookie Dough!");
                break;
        }
    }

    public void showTopping(String[] a_topping) {
        System.out.println("What topping would you like?");
        System.out.println();

        for (String i : a_topping) System.out.println(i);
    }

    public void selectTopping() throws IOException {
        char t_choice = (char) System.in.read();
        System.out.println();

        switch (t_choice) {
            case '1':
                System.out.println("You selected Sprinkles!");
                break;
            case '2':
                System.out.println("You selected Hot Fudge!");
                break;
            case '3':
                System.out.println("You selected Caramel!");
                break;
            case '4':
                System.out.println("You selected Whipped Cream!");
                break;
            case '5':
                System.out.println("You selected Nuts!");
                break;
        }
    }

    public void show_Cup_Cone() {
        System.out.println("Would you like it in a cup or in a cone?");
        System.out.println();
        System.out.println("1. Cup");
        System.out.println("2. Cone");
    }

    public void select_Cup_Cone() throws IOException {
        char cc_choice = (char) System.in.read();
        System.out.println();

        switch (cc_choice) {
            case '1':
                System.out.println("You chose a Cup!");
                break;

            case '2':
                System.out.println("You chose a Cone!");
        }
    }
}
