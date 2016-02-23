package usingarrays;

import java.util.Arrays;

/**
 * Created by Cardoso on 23-Feb-16.
 */
public class ArrayTest {
    public static void main (String [] args) {
        int[]list = {5, 20, 40, 15, 1, 30, 100, 6, 300, 23, 48};
        int[]shortList = Arrays.copyOfRange(list,3,9);

        System.out.println(list[2]);//print value in position [2]

        System.out.println("");
        System.out.println("The unsorted array is:");
        for (int i = 0; i < list.length; i++){//this is the general form of the for statement
            System.out.println(list[i]);//prints the array like it is, unsorted
            //for (int unsorted : list) {
            // : is a ternary operator
            //this is the enhanced form of the for statement and is preferred
            //System.out.println(unsorted);
        }

        System.out.println("");
        Arrays.sort(list);//sorts the list
        System.out.println("The sorted array is:");
        for (int sorted : list) {
            System.out.println(sorted);//prints the sorted list
        }

        System.out.println("");
        System.out.println("The unsorted short array is:");
        for (int unsortedShort : shortList) {
            System.out.println(unsortedShort);//prints the unsorted short array
        }

        System.out.println("");
        Arrays.sort(shortList);//sorts the list
        System.out.println("The sorted short array is:");
        for (int sortedShort : shortList) {
            System.out.println(sortedShort);//prints the sorted short array
        }
    }
}
