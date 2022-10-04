package com.bridgelabz;

public class SmallestElement {
    static int smallElement(int arr[]){
        int smallestElement=arr[1];
        int secondSmallestElement=arr[2];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallestElement){
                secondSmallestElement=smallestElement;
                smallestElement=arr[i];
            }
            else if (arr[i]<secondSmallestElement && arr[i]!=smallestElement) {
                secondSmallestElement=arr[i];
            }
        }
        if(smallestElement==0){
            System.out.println("Smallest element is 0");
        }
        else{
            System.out.println("Smallest element is => "+smallestElement);
        }
        return smallestElement;
    }

    public static void main(String[] args) {
        int array[]={9,78,27,36,85,12,1,5,89,6};
        smallElement(array);
    }
}

