package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        double[] nums = {2.1, 3.2, -1.4, 4.9, 6.5, -8.1, 7.2, -4.8, -12.2, 13.6, 1.1, -5.5, -6.1, 5.1, 19.1};

        //1
        double sumOfPositiveNums = 0;
        double positiveNumsCounter=0;
        boolean firstNegativeNum = false;
        for (double num : nums) {
            if (!firstNegativeNum) {
                if (num < 0) {
                    firstNegativeNum = true;
                }
            }

            if (firstNegativeNum) {
                if (num > 0) {
                    sumOfPositiveNums += num;
                    positiveNumsCounter++;
                }
            }

        }

        System.out.println(sumOfPositiveNums/positiveNumsCounter);



        //2
        int[] arr = {6, 3, 8, -4, 2, -2};

        for (int i = 0; i < arr.length; i++) {
            int minNumIndex=getMinNumIndex(arr,i);
            int currentNum=arr[i];
            int minNum=arr[minNumIndex];
            arr[i]=minNum;
            arr[minNumIndex]=currentNum;
            System.out.println(i+") "+Arrays.toString(arr));
        }


    }

    public static int getMinNumIndex(int[] arr, int pos) {
        int min = Integer.MAX_VALUE;
        int minNumIndex=-1;
        for (int i = pos; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minNumIndex=i;
            }
        }

        return minNumIndex;
    }

}
