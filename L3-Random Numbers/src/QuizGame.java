import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class QuizGame {

    static JPanel panel;
    static JLabel reultLabel;
    static JButton creatProblem, Checkanswer;
    static JTextField InputAnwer;
    static JRadioButton add, sub, mult, div;
    static ButtonGroup radios = new ButtonGroup();

    static int userAnswer, correctAnswer;
   static String displayPromblem = "";

    public static void main(String[] args) {

        new QuizGame();
        /*int choice = input("Choose Addition(1) Subtraction(2) Multiplication(3) Divition(4)");

       CreatProblem(choice);



        System.out.println(displayPromblem);
        System.out.println(correctAnswer);*/
    }

    public QuizGame(){

        JFrame frame = new JFrame("quiz game");
        frame.setSize(300, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);



        Checkanswer = new JButton("check");
        reultLabel = new JLabel("result");

        creatProblem=new JButton("make a problem");
        InputAnwer=new JTextField(10);


        panel.setLayout(null);
        panel = new JPanel();
        add = new JRadioButton("addition");
        sub = new JRadioButton("subtraction");
        mult = new JRadioButton("multiply");
        div = new JRadioButton("division");

        add.setSelected(true);

        radios.add(add);
        radios.add(sub);
        radios.add(mult);
        radios.add(div);


        panel.add(add);
        panel.add(sub);
        panel.add(mult);
        panel.add(div);

        add.setBounds(20,25,200,50);
        sub.setBounds(20,50,200,50);
        mult.setBounds(20,75,200,50);
        div.setBounds(20,10,200,50);
        creatProblem.setBounds(50, 125, 200, 25);
        InputAnwer.setBounds(50, 157, 200, 25);
        Checkanswer.setBounds(50, 200, 200, 25);
        reultLabel.setBounds(50, 225, 200, 25);

        creatProblem.addActionListener(new NewProblem());

        frame.add(panel);
        frame.setVisible(true);


    }
    private  class NewProblem implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            if (add.isSelected()){
                addProblem();
            }
            if (sub.isSelected()){
                subPROBLEM();

            }
            if (mult.isSelected()){
                MultProblem();
            }
            if (div.isSelected()){
                DivideProblem();
            }
            panel.remove(creatProblem);
            panel.updateUI();
        }
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

public static void checkAnswerr (){
        if (userAnswer == correctAnswer){
            reultLabel.setText("correct");
            panel.add(creatProblem);
            panel.updateUI();
        }
        else {reultLabel.setText("nah you suck");}


}

}



















































}
