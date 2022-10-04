package com.bridgelabz;

public class SortArray {
    static void sort(int arr[]){
        int temp=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+"  ");
        }
    }

    public static void main(String[] args) {
        int array[]={78,98,45,65,21,32,54,85,41};
        System.out.print("Array in ascending order is => ");
        sort(array);
    }
}
