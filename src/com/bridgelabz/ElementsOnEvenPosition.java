package com.bridgelabz;

public class ElementsOnEvenPosition {
    static void evenPosition(int arr[]){
        System.out.print("Elements present on even position are => ");
        for(int i=0;i<arr.length;i+=2){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String[] args) {
        int array[]={12,15,45,78,58,96,35,25,87,98};
        evenPosition(array);
    }
}
