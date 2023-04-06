package org.launchcode.java.demos.lsn3classes1.studio;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you've done tha, it's pretty straightforward from there.";
        char[] quoteCharArray = quote.toCharArray(); //creates array of characters
        HashMap<Character, Integer> counts = new HashMap<>(); //Character is the letter/punctuation, Integer is the amount of times it appears

        for (char letter: quoteCharArray) { //reads "for letters in charactersInString" array of characters from exmple quote
            if (counts.containsKey(letter)) { //if HashMap contains letter
                counts.put(letter, counts.get(letter) + 1); //+1 to counts each time
            }else{
                counts.put(letter, 1); //else assign value as 1
            }
        }

        for (Map.Entry<Character, Integer> total : counts.entrySet()) { //Map represents key/value pairs in HashMap
            //Each Map.Entry object has a getKey method and a getValue method, which represent key & value
            System.out.println(total.getKey() + ": " + total.getValue());

        }


    }
}
