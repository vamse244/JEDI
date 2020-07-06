import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


//https://www.hackerrank.com/challenges/new-year-chaos/problem/

public class NewYearChaos {

 
 
    public static void findNumOfBribes(int array[], int sizeOfArray) {

        int bribeCount = 0;
        for (int index = sizeOfArray- 1; index >= 0; index--) {
            
            if (array[index] != index + 1) {
                if (((index - 1) >= 0) && array[index - 1] == (index + 1)) {

                    bribeCount++;
                    swapElementInArray(array, index, index - 1);
                } else if (((index - 2) >= 0) && array[index - 2] == (index + 1)) {
                    bribeCount = bribeCount + 2;
                    swapElementInArray(array, index - 2, index - 1);
                    swapElementInArray(array, index - 1, index);
                } else {
                    System.out.println("Too chaotic");
                    return;

                }
            }
        }
        System.out.println(bribeCount);
    }

    private static void swapElementInArray(int[] array, int element1, int element2) {

        int temp = array[element1];
        array[element1] = array[element2];
        array[element2] = temp;

    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int totalCases = inputScanner.nextInt();
        for (int indexEle = 0; indexEle < totalCases; indexEle++) {
            int sizeOfArray = inputScanner.nextInt();
            int problemArray[] = new int[sizeOfArray];
            for (int index = 0; index < sizeOfArray; index++) {
                problemArray[index] = inputScanner.nextInt();
            }
            findNumOfBribes(problemArray, sizeOfArray);

        }
        inputScanner.close();
    }

}
