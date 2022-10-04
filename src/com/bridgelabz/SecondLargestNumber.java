package com.bridgelabz;

public class SecondLargestNumber {
    static int secondLargest(int arr[]){
        int largestNumber=0;
        int secondLargestNumber=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largestNumber){
                secondLargestNumber=largestNumber;
                largestNumber=arr[i];
            }
            else if (arr[i]>secondLargestNumber && arr[i]!=largestNumber) {
                secondLargestNumber=arr[i];
            }
        }
        if(largestNumber==0){
            System.out.println("No largest number");
        }
        else{
            System.out.println("Second Largest number is => "+secondLargestNumber);
        }
        return secondLargestNumber;
    }

    public static void main(String[] args) {
        int array[]={10,15,5,8,78,98,56,25,45,65};
        secondLargest(array);
    }
}

