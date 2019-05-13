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
        int tries = 15;
        int choice = generator.nextInt(words.length);

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
        }


    }








    }
}
