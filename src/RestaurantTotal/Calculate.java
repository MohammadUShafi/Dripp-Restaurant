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

