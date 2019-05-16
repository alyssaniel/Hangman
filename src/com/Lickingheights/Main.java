package com.Lickingheights;
import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
	// write your code here
        //Scanners
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        Random generator  = new Random();

        //Strings
        String lettersGuessed = null;
        String lettersWrong = null;
        String lettersRight = null;
        String[] words = {"cat","love","programming","updates","grapes"};
        String userGuess = null;

        //ints
        int mistakes = 0;
        int tries = 13;
        int choice = generator.nextInt(words.length);
        int wordTowin;
        String secretWord = words[choice];

        System.out.println(secretWord);





        System.out.println("Welcome to Hangman.");
        System.out.println("Guess a letter:");
        userGuess = keyboard.nextLine();

        lettersGuessed += userGuess;

        if(secretWord.indexOf(userGuess)>=0){
            lettersRight += userGuess;
        } else {
            lettersWrong += userGuess;
        }
        displayBoard(mistakes);
        for ( int i = 0 ; i < secretWord.length() ; i++ ) {
            System.out.print("_ ");
            wordTowin = keyboard.nextInt();
        }


    }

    public static void
    displayBoard(int mistakes) {
        switch (mistakes) {


           case 0:
           System.out.println("------------------+                 \n" +
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
                                "|                 0                \n" +
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
                                "|                 0                 \n" +
                                "|                 |                  \n" +
                                "|                                   \n" +
                                "|                                 \n" +
                                "|                                   \n" +
                                "_______________________________");
                break;
            case 3:
                System.out.println(
                        "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 0                 \n" +
                                "|                -|                  \n" +
                                "|                                   \n" +
                                "|                                 \n" +
                                "|                                   \n" +
                                "_______________________________");
                break;
            case 4:
                System.out.println(
                        "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 0                 \n" +
                                "|                -|-                  \n" +
                                "|                                   \n" +
                                "|                                 \n" +
                                "|                                   \n" +
                                "_______________________________");
                break;
            case 5:
                System.out.println(
                        "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 0                 \n" +
                                "|               --|--                  \n" +
                                "|                 |                  \n" +
                                "|                                 \n" +
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
                                "|               --|--                  \n" +
                                "|                 |                  \n" +
                                "|                /                \n" +
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
                                "|               --|--                  \n" +
                                "|                 |                  \n" +
                                "|                /                  \n" +
                                "|                                   \n" +
                                "_______________________________");
                break;
        }




    }









}
