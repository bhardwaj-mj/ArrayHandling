package com.bridgelabz;

public class DuplicateElementsOfArray {
    public static void main(String[] args) {
        int array[]={10,10,10,20,20,20,30,30,30,40,10,10,20,20,20};
        boolean visited[]=new boolean[array.length];
        System.out.print("Duplicate elements are =>");
        for(int i=0;i<array.length;i++){
            if(visited[i]==true){
                continue;}
            int count = 1;
            for(int j=i+1;j<array.length;j++) {
                if (array[i] == array[j]) {
                    visited[j]=true;
                    count++;
                }
            }
            System.out.print(array[i]+"  ");
        }
    }
}
