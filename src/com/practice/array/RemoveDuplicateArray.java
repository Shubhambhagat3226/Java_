package com.practice.array;

import java.util.Scanner;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int[] array = inputArray();
        printArray(array);
        int[] a = removeDuplicateElement(array);
        System.out.println("after remove");
        printArray(a);
    }

    static int[] inputArray(){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the no. of  element of array : ");
        int num = in.nextInt();

        int[] a = new int[num];
        for (int i = 0; i < num; i++ ) {
            System.out.printf("now enter the element %d of arrray : ", i+1);
            a[i] = in.nextInt();
        }
        return a;
    }

   static int[] removeDuplicateElement(int[] array){
        int size = array.length;
        int[] temp = new int[size];
        int j = 0;
        for (int i = 0; i < size-1; i++){
            if (array[i] != array[i+1]){
                temp[j] = array[i];
                j++;
            }
        }

        if(temp[j-1] != array[size -1]){
            temp[j++] = array[size-1];
        }

        return temp;

//        for (int i = 0; i < j; i++) {
//            array[i] = temp[i];
//        }
    }

   static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
