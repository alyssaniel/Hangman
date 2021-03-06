package com.Lickingheights;
import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        // write your code here
        //Scanners
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        Random generator = new Random();

        //Strings
        String lettersGuessed = null;
        String lettersWrong = null;
        String lettersRight = null;
        String[] words = {"cat", "love", "programming", "updates", "grapes"};
        String userGuess = null;

        //ints
        int mistakes = 0;
        int tries = 15;
        int choice = generator.nextInt(words.length);
        int wordTowin;
        boolean solved = false;
        String secretWord = words[choice];
        boolean allthere = false;

        System.out.println(secretWord);

        System.out.println("Welcome to Hangman.");

        while (solved == false) {
            System.out.println("Guess a letter:");
            userGuess = keyboard.nextLine();

            lettersGuessed += userGuess;

            if (secretWord.indexOf(userGuess) >= 0) {
                lettersRight += userGuess;
            } else {
                lettersWrong += userGuess;
                mistakes = mistakes + 1;
            }
            displayBoard(mistakes);
            for (int i = 0; i < secretWord.length(); i++) {

                if ( 0 <= lettersGuessed.indexOf( secretWord.charAt(i) ) ){
                    allthere =true;
                }else {
                    allthere =false;
                }

            }

            if ( allthere == true ){
                solved =true;

            }
        }


        System.out.println("Correct!");
        System.out.println("Bye");
    }

    public static void displayBoard ( int mistakes){
        switch (mistakes)

        {

            case 0:
                System.out.println(
                        "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "_______________________________");

                break;
            case 1:
                System.out.println(
                        "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 o                 \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "_______________________________");

                break;
            case 2:
                System.out.println(
                        "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 o                 \n" +
                                "|                 |                 \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "_______________________________");

                break;
            case 3:
                System.out.println(
                        "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 O                 \n" +
                                "|                 |>                \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "_______________________________");

                break;
            case 4:
                System.out.println(
                        "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 O                 \n" +
                                "|                <|>                \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "_______________________________");

                break;
            case 5:
                System.out.println(
                        "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 O                 \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "_______________________________");

                break;
            case 6:
                System.out.println(
                        "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 o                 \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                  -                 \n" +
                                "|                                   \n" +
                                "_______________________________");

                break;
            case 7:
                System.out.println(
                        "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 o                 \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                - -              \n" +
                                "|                                   \n" +
                                "_______________________________");

                break;
            case 8:
                System.out.println(
                        "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 o                 \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                - -              \n" +
                                "|               (                   \n" +
                                "_______________________________");

                break;
            case 9:
                System.out.println(
                        "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 o                 \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                - -            \n" +
                                "|               (   )                 \n" +
                                "_______________________________");

                break;
            case 10:
                System.out.println(
                        "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 o                 \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                - -                \n" +
                                "|               (   )_              \n" +
                                "_______________________________");

                break;
            case 11:
                System.out.println(
                        "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 o                 \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                - -                \n" +
                                "|              _(   )_              \n" +
                                "_______________________________");

                break;
            case 12:
                System.out.println(
                        "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 o.                \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                - -                \n" +
                                "|              _(   )_              \n" +
                                "_______________________________");

                break;
            case 13:
                System.out.println(
                        "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                .o.                \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                - -                \n" +
                                "|              _(   )_              \n" +
                                "_______________________________");

                break;
            case 14:
                System.out.println(
                        "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                .o.                \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                - -                \n" +
                                "|             *_(   )_              \n" +
                                "_______________________________");

                break;
            case 15:
                System.out.println(
                        "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                .o.                \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                - -                \n" +
                                "|             *_(   )_*             \n" +
                                "_______________________________");

                break;

        }


    }
}


