package Algos;

import java.util.ArrayList;

public class Sorting {
    static void main() {
        int[] arr = {7,8,3,1,2};
        bubbleSort(arr);
    }

    static void bubbleSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printSortedArray(arr);
    }


    static void printSortedArray(int[] arr){
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }

        ArrayList<Integer> finalArr = new ArrayList<>();
        for (int j : arr) {
            finalArr.add(j);
        }

        System.out.print(finalArr);
    }
}
