package com.company;
import java.util.Scanner;

public class QuizRunner {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        String[] answerkey = {"b","d","a","a","c","a","a","d","b","b","b","d","c","a","c","c","a","d","a","a"};
        int n = 0;

        int correct = 0;
        int incorrect = 0;
        String answer = "";

        for (int i = 0; i < 20; i++){
            System.out.println("Please enter your answers. Acceptable input is limited to A,B,C and D.\n");
            answer = input.next();

        }

        if (answer.compareTo(answerkey[i]) == 0) { or if (answer.equals(answerkey[i])) {
            correct++;}
        else {incorrect++;}
        }

        if (correct > 14){
            System.out.println("You passed.");
        } else {
            System.out.println("You failed.");
        }
        System.out.println("You have " + correct + " correct answers.");
        System.out.println("You have " + incorrect + " incorrect answers.");
    }
}

/*only a main method. The program should create several questions, present them to the user, accept the user’s responses,
and then tell them whether their answers were correct or incorrect.*/

