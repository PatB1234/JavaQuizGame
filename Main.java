package com.main.quiz.coding.problem;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // declaring the questions and answers
        String jokeQuestions[] = { "Largest planet ? ", "Worse song ever ? ", "Capital of Peru?", "Roman god of War ?" };
        String jokeAnswers[] = { "Jupiter", "Castles in the Sky", "Lima", "Mars" };
        int score = 0;

        for (int a = 0; a < jokeQuestions.length + 10; a++) {

            //Generates a random number to pick out a question and the relative answer from the array
            Random numGen = new Random();
            int i = numGen.nextInt(jokeQuestions.length);

            //Creates the question scanner
            Scanner query = new Scanner(System.in);
            System.out.println(jokeQuestions[i]);
            String answer = query.nextLine();

            if (answer.equalsIgnoreCase(jokeAnswers[i])) {

                //If answer correct, add 1 to score
                System.out.println("Correct!");
                score++;

            } else {

                //If answer is wrong, print Wrong and the correct answer and add nothing to the score
                System.out.println("Wrong! The correct answer is " + jokeAnswers[i]);
            }

            //Creates the scanner to check if you want to move onto the next question
            Scanner YN = new Scanner(System.in);
            System.out.println("Continue? Y or N");
            String YNAnswer = YN.nextLine();

            //Checks the scanner to see if you want to continue
            if (YNAnswer.equalsIgnoreCase("Y")) {


            } else if (YNAnswer.equalsIgnoreCase("N")) {

                System.exit(0);
            } else {

                System.out.println("I said Y OR N not " + YNAnswer);
                System.exit(0);
            }
        }

        //Prints your final score
        System.out.println("Your final score was: " + score);
    }
}
