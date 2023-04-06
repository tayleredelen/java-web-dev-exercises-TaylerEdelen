package org.launchcode.java.demos.lsn3classes1.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    //1b) Within main create a list with 10 integers and call method on list
    public static void main(String[] args) {
        //ArrayList<Integer> numsSum = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)); //.asList better than .add
        //Integer theSum = ArrayListPractice.sumEven(numsSum);
        //System.out.println("The sum of the even values is " + theSum.toString());
        ArrayList<String> searchWords = new ArrayList<String>(Arrays.asList("Purple", "Red", "Green")); //.asList betterh than .add
        System.out.println("What word length are you searching for?");
        Integer searchLength = ArrayListPractice.lengthInput();
        ArrayListPractice.fiveLetters(searchWords, searchLength);
        //numsSum.add(1);
        //numsSum.add(2);
        //numsSum.add(3);
        //numsSum.add(4);
        //numsSum.add(5);
        //numsSum.add(6);
        //numsSum.add(7);
        //numsSum.add(8);
        //numsSum.add(9);
        //numsSum.add(10);
    }

    //3) Prompt user to enter word length for search
    public static Integer lengthInput() {
        Scanner input = new Scanner(System.in);
        Integer myUserInt = input.nextInt();
        input.close();
        return myUserInt;
    }

    //2) Static method to print out each word in a list that has exactly 5 letters
    public static void fiveLetters(ArrayList<String> words, Integer searchLength) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == searchLength) {
//            if(words.get(i).length() == 5) { //is word length 5
                System.out.println(words.get(i));
            }
        }
    }

    //1a) Static method to find sum of even values
    public static Integer sumEven(ArrayList<Integer> valuesToSum) {
        Integer sum = 0;
        for (int i = 0; i < valuesToSum.size(); i++) {
            if (valuesToSum.get(i) % 2 == 0) {
                sum = sum + valuesToSum.get(i);
            }
        }
        return sum;
    }
}
