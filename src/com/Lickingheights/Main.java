import java.util.Scanner;
import java.util.Random;
package com.Lickingheights;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //ints
        int mistakes = 0;
        int tries = 15;
        int choice = generator.nextInt(words.length);

        //Scanners
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        Random generator  = new Random();

        //Strings
        String lettersGuessed = null;
        String lettersWrong = null;
        String lettersRight = null;
        String[] words = {"cat","love","programming","updates","grapes"};
        String secretWord = words[choice];
        String userGuess = null;
        System.out.println(secretWord);





        System.out.println("Welcome to Hangman");
        System.out.println("");








    }
}
