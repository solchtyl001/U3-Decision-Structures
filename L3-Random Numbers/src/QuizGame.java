import javax.swing.*;
import java.util.Random;

public class QuizGame {

    static int userAnswer, correctAnswer;
   static String displayPromblem = "";

    public static void main(String[] args) {
        int choice = input("Choose Addition(1) Subtraction(2) Multiplication(3) Divition(4)");

       CreatProblem(choice);



        System.out.println(displayPromblem);
        System.out.println(correctAnswer);


    }
public static void CreatProblem(int choice){

    if(choice>=1){
        if (choice==1){
            addProblem();
        }
        if (choice==2){subPROBLEM();}
        if (choice==3){MultProblem();}
        if (choice==4){DivideProblem();}
    }else System.out.println("Are you dumb? restart the program");


}

    public static void addProblem(){
      int num1 = random();
      int num2 = random();

      correctAnswer = num1+num2;
      displayPromblem = num1+"+"+num2;


    }

    public static void subPROBLEM(){
        int num1 = random();
        int num2 = random();

        correctAnswer = num1-num2;
        displayPromblem = num1+"-"+num2;





    }

    public static void MultProblem(){

        int num1 = random();
        int num2 = random();

        correctAnswer = num1*num2;
        displayPromblem = num1+"*"+num2;





    }
    public static void DivideProblem(){

        int num1 = random();
        int num2 = random();

        correctAnswer = num1/num2;
        displayPromblem = num1+"/"+num2;



    }

public static int random(){

    Random random = new Random();

    return random.nextInt(20)+1;

}

public static int input(String message){

        return Integer.parseInt(JOptionPane.showInputDialog(message));


}



















































}
