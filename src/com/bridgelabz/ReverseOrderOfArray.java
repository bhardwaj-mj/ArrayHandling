package com.bridgelabz;

public class ReverseOrderOfArray {
    static void reverseArray(int arr[]){
        System.out.print("Reverse of the array is ==> ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String[] args) {
        int array[]={15,45,25,78,85,65,28,17,96,100};
        reverseArray(array);
    }
}
