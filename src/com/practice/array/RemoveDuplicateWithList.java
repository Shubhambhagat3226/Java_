package com.practice.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Collections;

public class RemoveDuplicateWithList {
    List<Integer> array;

    RemoveDuplicateWithList() {
        this.array = new ArrayList<>();
    }

    void inputArrayList(){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number of element of array list : ");
        int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.printf("Please enter the element %d of array : ", i+1);
            int value = in.nextInt();
            array.add(value);
        }
    }

    void showArrayList(){
        for (int i = 0; i < array.size(); i++) {
            System.out.printf("%d ",array.get(i));
        }
    }

    void removeCopy(){
        int[] temp = new int[array.size()];
        int j = 0;

        Collections.sort(array);

        for (int i = 0; i < array.size()-1; i++) {
            if(Objects.equals(array.get(i), array.get(i + 1))){
                continue;
            }
            temp[j++] = array.get(i);
//            System.out.println("temp " + temp[j-1]);
        }

//        for (int i = 0; i < j; i++) {
//            System.out.print(temp[i] + " ");
//        }

        if(temp[j] != array.get(array.size()-1)){
            temp[j++] = array.get(array.size()-1);
        }

        array.clear();
        for (int i = 0; i < j; i++) {
            array.add(temp[i]);
        }
    }

    public static void main(String[] args) {
        RemoveDuplicateWithList obj = new RemoveDuplicateWithList();
        obj.inputArrayList();
        obj.showArrayList();

        System.out.println("after remove call");
        obj.removeCopy();
        obj.showArrayList();
    }

}
