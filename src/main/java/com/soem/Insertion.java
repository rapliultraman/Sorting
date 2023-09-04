package com.soem;


public class Insertion {

    public void insertionSort(int array[]){
        int size = array.length;
        int swapCount = 0;

        for(int step = 1; step < size; step++){
            int key = array[step];
            int j = step - 1;

            while (j >= 0 && key < array[j]){
                array[j + 1] = array[j];
                --j;
            }
            swapCount++;
            array[j + 1] = key;
        }
             System.out.println("Array setelah diurutkan:");
             for (int value : array) {
                 System.out.print(value + " ");
        }
        System.out.println("\nhasil berapa kali swap: " + swapCount);

     }
  
    
}

