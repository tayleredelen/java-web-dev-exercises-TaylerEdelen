package org.launchcode.java.demos.lsn2controlflowandcollections.exercise;

import java.util.Scanner; //imports Scanner
public class Alice {
    public static void main(String[] args) {
        String story = "Alice was beginning to get very tired of sitting by her sister on the bank" +
                "and of having nothing to do: once or twice she had peeped into the book her sister" +
                " was reading, but it had no pictures or conversations in it, 'and what is the use of " +
                "a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in); //input variable of type Scanner
        System.out.println("Enter a word to search for: "); //question asked of user
        String wordSearch = input.nextLine().toLowerCase(); //creates case insensitivity
        boolean found = story.toLowerCase().contains(wordSearch); //returns boolean if word found or nah
        System.out.println("Word found: " + found);
        Integer index = story.indexOf(wordSearch);
        System.out.println("Your searched word first appears at index " + index + ". The story with your word removed is: ");
        //^prints found word index with string and length
        String modifiedStory = story.replace(wordSearch, ""); //removes string
        System.out.println(modifiedStory); //prints story without word
    }
}
