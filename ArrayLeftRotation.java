import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//	https://www.hackerrank.com/challenges/array-left-rotation/problem

public class ArrayLeftRotation {

    
    
    static int[] arrayLeftRotation(int[] array, int numOfRotations) {


     int[] tempArray= new int[numOfRotations];

          for(int index = 0; index < numOfRotations; index++){

    int firstElement = array[0],arrayIndex;
    for(  arrayIndex = 0;arrayIndex < array.length - 1 ; arrayIndex++){
        array[arrayIndex] = array[arrayIndex+1];
    }
    a[arrayIndex] = firstElement;

          }
            
        

        return array;
  
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = arrayLeftRotation(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
