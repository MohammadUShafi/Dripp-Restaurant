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

package RestaurantTotal;
import RestaurantMenu.*;

public interface ShowCalculate {
    void showTotal(); //output total cost
}

package RestaurantTotal;
import RestaurantMenu.*;

public class Calculate extends Custom {
    private double f_total;
    private double t_total;
    private double total;

    Calculate(String[] f, String[] t, double f_tot, double t_tot, double tot) {//constructor
        super(f,t);
        f_total = f_tot;
        t_total = t_tot;
        total = tot;
    }

    //mutator
    void setF_Total(double f_tot) {f_total = 0;}
    void setT_Total(double t_tot) {t_total = 0;}
    void setTotal(double tot) {total = 0;}

    //accessor
    double getF_Total() {return f_total;}
    double getT_Total() {return t_total;}
    double getTotal() {return total;}

    void showTotal() {
        f_total = 3.99;
        t_total = 1.00;
        total = f_total + t_total;
        System.out.println();
        System.out.println("Your total is $" + total + ". Please pay at the register, Thanks for coming!");
    }
}

package RestaurantTotal;
import RestaurantMenu.*;

public class MainMenu {
    public static void main(String args[])
            throws java.io.IOException {

        // display flavors
        String[] a_flavor = new String[]{"1. Vanilla - $3.99", "2. Chocolate - $3.99", "3. Cookies & Cream - $3.99", "4. Mint Chocolate Chip - $3.99", "5. Chocolate Chip Cookie Dough - $3.99"};

        //display toppings
        String[] a_topping = new String[]{"1. Sprinkles - $1.00", "2. Hot Fudge - $1.00", "3. Caramel - $1.00", "4. Whipped Cream - $1.00", "5. Nuts - $1.00"};

        Custom f = new Custom(a_flavor, a_topping); // create an object
        Calculate t = new Calculate(a_flavor, a_topping, 0, 0, 0); //create object

        char choice, f_choice, t_choice, cc_choice;  //get input from user

        do { // start menu
            System.out.println("Welcome to Dripp!");
            System.out.println("Please choose from one of our signature creations or create your own!");
            System.out.println("1. Oreo Overload $6.99");
            System.out.println("2. Birthday Cake Remix $6.99");
            System.out.println("3. Chocolate Devotion $6.99");
            System.out.println("4. Strawberry Blonde $6.99");
            System.out.println("5. Founders Favorite $6.99");
            System.out.println("6. Create Your Own!");

            choice = (char) System.in.read(); //input for start menu

        } while (choice < '1' | choice > '6');

        System.out.println();

        switch (choice) {
            case '1':
                System.out.println("Ingredients: Sweet Cream Ice Cream with Chocolate Chips, double the OREO® Cookies and Fudge");
                System.out.println("Please pay at the register, thanks for coming!");
                break;
            case '2':
                System.out.println("Ingredients: Cake Batter Ice Cream® with Rainbow Sprinkles, Brownie and Fudge");
                System.out.println("Please pay at the register, thanks for coming!");
                break;
            case '3':
                System.out.println("Ingredients: Chocolate Ice Cream with Chocolate Chips, Brownie and Fudge");
                System.out.println("Please pay at the register, thanks for coming!");
                break;
            case '4':
                System.out.println("Ingredients: Strawberry Ice Cream with Graham Cracker Pie Crust, Strawberries, Caramel and Whipped Topping");
                System.out.println("Please pay at the register, thanks for coming!");
                break;
            case '5':
                System.out.println("Ingredients: Sweet Cream Ice Cream with Pecans, Brownie, Fudge and Caramel");
                System.out.println("Please pay at the register, thanks for coming!");
                break;
            case '6':
                f.showFlavor(a_flavor); //call to show the flavor menu
                f_choice = (char) System.in.read(); //input for flavor menu
                f.selectFlavor(); //call to select from flavor menu

                f.showTopping(a_topping); //call to show topping menu
                t_choice = (char) System.in.read(); //input for topping menu
                f.selectTopping(); //call to select  from topping menu

                f.show_Cup_Cone(); //call to show cup/cone
                cc_choice = (char) System.in.read(); //input for cup/cone
                f.select_Cup_Cone(); //call to select cup/cone

                t.showTotal(); //display the total amount
                break;
        }
    }
}

