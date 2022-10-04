package com.bridgelabz;

public class ArrayElements {
    static void arrElement() {
        int arr[] = new int[10];
        arr[0] = 10;
        arr[1] = 15;
        arr[2] = 20;
        arr[3] = 25;
        arr[4] = 30;
        arr[5] = 35;
        arr[6] = 40;
        arr[7] = 45;
        arr[8] = 50;
        arr[9] = 55;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Elements of array are ");
        arrElement();
    }
}

