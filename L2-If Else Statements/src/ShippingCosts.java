import javax.swing.*;

public class ShippingCosts {

    /*
    A Shipping Company charges the following rates
    for each 100 miles shipped:

    2lbs or less ..................... $1.10
    over 2lbs but less than 6lbs ..... $2.20
    over 6lbs but less than 10lbs .... $3.70
    over 10lbs ....................... $4.80

    Write a program to calculate the shipping price. The
    distance is not prorated, in other words, the price doesn't
    increase until the next 100 miles, i.e. 150 miles for a 3lbs
    package is still just $2.20.

    Example Run:
    Weight: 5.6lbs
    Distance: 345 miles
    Price: $6.60

    As always, your program should include a method.
     */

    public static void main(String[] args) {
       double weight = Double.parseDouble(JOptionPane.showInputDialog("enter weight"));
       int milesShipped =Integer.parseInt(JOptionPane.showInputDialog("enter shipping distance"));
       double shippingCost;
       double cost;

       if (weight>=10){
       shippingCost = 4.8;

       }
       else {
         if (weight<=10){
             shippingCost=2.20;
         }else {
             shippingCost = 1.10;
         }
       }
    cost= cost(shippingCost, milesShipped);
        JOptionPane.showMessageDialog(null, "cost is "+cost);
    }


    public static double cost(double rate, int miles) {

        int costMultiplyer = miles/100;

        if (costMultiplyer == 0) {
            costMultiplyer = 1;
        }
        return rate * costMultiplyer;

    }





    }














