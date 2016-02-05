package com.findaway.challenge.wordcannon;

import java.util.Scanner;

/**
 * Created by kkovach on 2/5/16.
 */
public class WordCannons {

    Word word1, word2;

    public WordCannons() {

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        WordCannons wordCannons = new WordCannons();
        String playAgain = "Y";

        while (playAgain.equals("Y")) {

            wordCannons.play();

            System.out.print("Play again? (Y/N): ");
            playAgain = scanner.next();
        }
    }

    private void play() {

        Scanner scanner = new Scanner(System.in);

        while (!valid(word1)) {

            System.out.print("Enter word 1: ");
            word1 = new Word(scanner.next());
        }

        while (!valid(word2)) {

            System.out.print("Enter word 2: ");
            word2 = new Word(scanner.next());
        }

        if (word1.compareTo(word2) < 0)
            System.out.println("Word 1 wins!");
        else if (word1.compareTo(word2) == 0)
            System.out.println("Words tie!");
        else
            System.out.println("Word 2 wins!");

        reset();
    }

    private void reset() {

        word1 = null;
        word2 = null;
    }

    private boolean valid(Word word) {

        return word != null && !word.get().equals("");

    }
}
