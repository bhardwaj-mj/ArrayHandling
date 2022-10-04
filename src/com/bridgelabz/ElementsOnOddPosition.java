package com.bridgelabz;

public class ElementsOnOddPosition {
    static void oddPosition(int arr[]){
        System.out.print("Elements present on odd position are => ");
        for(int i=1;i<arr.length;i+=2){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String[] args) {
        int array[]={11,22,33,44,55,66,77,88,99,110};
        oddPosition(array);
    }
}
