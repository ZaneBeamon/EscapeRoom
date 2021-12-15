import com.sun.deploy.panel.RuleSetViewerDialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.awt.*;


public class EscapeRoom {

    JFrame question;
     static String Display = "";
     static JPanel panel;
     static JLabel QuestionLabel;
     JRadioButton Yes, No;
     static JButton Speak;
    String Question = "";

    public EscapeRoom() {

        JFrame frame = new JFrame("DeadBrains");
        frame.setSize(300, 450);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        Yes = new JRadioButton("why not");
        No = new JRadioButton("maybe Not");
        Speak = new JButton("say.....");
        QuestionLabel = new JLabel();

        Yes.setBounds(50, 10, 200, 30);
        No.setBounds(50, 70, 200, 30);
        Speak.setBounds(50, 130, 200, 30);



        panel.add(Yes);
        panel.add(No);
        panel.add(Speak);

        frame.add(panel);
        frame.setVisible(true);



        if(Yes.isSelected()){
            System.out.println("well then, lets begin");
            System.out.println("i will give you some keys, take 1 of them.");
            System.out.println("depending on which key you choose, ill ask you a question");
            System.out.println("answer it correctly, and ill give you another key");
        }else if(No.isSelected()){
            System.out.println("if you say so, have fun waiting");
        }else{
            System.out.println("let me restate that");
        }


    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String Name = "";

        System.out.println("Please choose a character to play (1 - 4)");
        double Character = read.nextDouble();

        if (Character >= 1) {
            Name = "Jack";
        }

        if (Character >= 2) {
            Name = "Mai";
        }

        if (Character >= 3) {
            Name = "'Bugs' ";
        }

        if (Character >= 4) {
            Name = "Evan";
        }


        System.out.println("Your name is " + Name);
        System.out.println("Greetings " + Name + " my name i cannot tell, that is to remain secret for now. But you can call me Cr4zi, I am what you would call a Trader for the fallen.");
        System.out.println("A shadowDealer they call me i, want to make a trade with you. seeing that the line is rather long for your judgement, why dont we play a game.");
        System.out.println("after all 'she' is rather busy today. ");
    }








}