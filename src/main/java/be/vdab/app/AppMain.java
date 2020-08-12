package be.vdab.app;

import be.vdab.utility.*;

public class AppMain {
    public static void main(String[] args) {
        System.out.println("Hangman Game with Word Collections.");
        HangmanGame hangmanGame = new HangmanGame();
        hangmanGame.newGame();
        hangmanGame.play();
    }
}
