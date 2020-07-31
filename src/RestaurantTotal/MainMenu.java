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

