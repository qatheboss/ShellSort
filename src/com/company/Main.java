package com.company;

import java.util.Arrays;

public class Main {

    public static void shellSort(int[] numbs) {
        int[] gaps = {701, 301, 132, 57, 23 , 10 , 4 , 1}; //Marcin Ciura
        for (int i = 0; i < gaps.length; i++) {
            int gap = gaps[i];
            for (int j = gap; j< numbs.length; j++) {
                int temp = numbs[j];
                int k = j;
                for (; k >= gap && numbs[k - gap] > temp; k -= gap) {
                    numbs[k] = numbs[k - gap];
                }
                numbs[k] = temp;
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        int[] numbs = new int[10];
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(numbs));
        shellSort(numbs);
        System.out.println(Arrays.toString(numbs));

    }
}
