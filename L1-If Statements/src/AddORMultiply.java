
import javax.swing.*;



public class AddORMultiply {

    /*
    Write two methods, one that adds two numbers and second that multiplies them.
    Then, write a main method that prompts the user to enter 2 numbers.

    If the first one is larger than the second, mutiply and display the result
    If not, add them and display the results.
     */
    public static void main(String[] args ) {

        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("enter first number"));
        double Num2 = Double.parseDouble(JOptionPane.showInputDialog("enter second number"));

            if (Num1>Num2){
                multply(Num1, Num2);


            }
           if (Num1<=Num2){
               add(Num1, Num2);

           }

    }


     public static void multply(Double Num1, Double Num2){

        double answer = Num1 * Num2;
         JOptionPane.showMessageDialog(null, "answer is "+ answer);



     }

     public static void add(Double Num1, Double Num2){

        double sum = Num1 + Num2;
         JOptionPane.showMessageDialog(null, "sum is "+ sum);






     }















}
