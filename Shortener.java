/*
 * Name: Ross Singleton
 * Student number: C1615528
 */

import java.io.*;
import java.util.*;

public class Shortener {
    // This class is only a starting point. You should complete all members
    // below, but you may also need to add other fields and methods to
    // finish the implementation as per the question on the assignment sheet.

    private File textFile;
    private ArrayList<String> abbreviations = new ArrayList<String>();

    public Shortener() {
        this.textFile = new File("abbreviations.txt");
    }

    /*
     * Constructor that will load the abbreviations file represented by the
     * File parameter.
     */
    public Shortener( File inAbbreviationsFile ) {
        this.textFile = inAbbreviationsFile;
    }

    /*
     * Constructor that will load the abbreviations file that the String
     * parameter is a file path for.
     */
    public Shortener( String inAbbreviationsFilePath ) {
      this.textFile = new File(inAbbreviationsFilePath);
    }

    /*
     * This method attempts to shorten a word by finding its abbreviation. If
     * no abbreviation exists for this word, then this method will return the
     * original (i.e., unshortened) word.
     *
     * You may assume that words are always lower case.
     *
     * `inWord` should be a single word (no spaces). It may optionally be
     * followed by one of the five following punctuation characters:
     *   ,
     *   ?
     *   .
     *   !
     *   ;
     * If one of these characters is at the end of the word this method will
     * shorten the word (ignoring the punctuation) and return the shortened
     * word with the punctuation character at the end.
     * For example,
     *     shortenerObject.shortenWord( "hello?" )
     * should return
     *     "lo?"
     *
     * You may assume that words are always lower case.
     */
    public String shortenWord( String inWord ) {
        inWord = inWord.trim();
        String endChar = inWord.substring(inWord.length() - 1);

        
    }

    /*
     * Attempts to shorten a message by replacing words with their
     * abbreviations.
     *
     * You may assume that messages are always lower case.
     *
     * Punctuation characters (,?.!;) should be retained after shortening. See
     * `shortenWord( String inWord )` for more information.
     */
    public String shortenMessage( String inMessage ) {
        // to be completed
    }
}
