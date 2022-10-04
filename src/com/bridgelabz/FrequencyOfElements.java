package com.bridgelabz;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int array[]={10,10,10,20,20,20,30,30,30,40};
        boolean visited[]=new boolean[10];
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
            System.out.println("Frequency of "+array[i]+ " is => " + count + " times");
        }
    }
}
