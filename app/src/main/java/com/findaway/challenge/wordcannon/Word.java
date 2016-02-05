package com.findaway.challenge.wordcannon;

/**
 * Created by kkovach on 2/5/16.
 */
public class Word implements Comparable<Word> {

    String original;

    public Word(String w) {

        original = w;
    }

    String get() {

        return original;
    }

    @Override
    public int compareTo(Word o) {

        StringBuilder word = new StringBuilder(original);
        StringBuilder otherWord = new StringBuilder(o.get());
        int i = 0, bothContain = -1;
        char character;

        while (i < word.length()) {

            character = word.charAt(i);
            bothContain = otherWord.indexOf(String.valueOf(character));

            if (bothContain != -1) {

                word.deleteCharAt(i);
                otherWord.deleteCharAt(bothContain);

            } else {

                i++;
            }
        }

        if (word.length() > otherWord.length())
            return -1;
        else if (word.length() == otherWord.length())
            return 0;
        else
            return 1;
    }
}
