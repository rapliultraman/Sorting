package com.soem;

public class Bubble {
   
    public void bubbeSort(int array[]){
        int size = array.length;
        int swapCount = 0;

        for (int i = 0; i < (size -1); i++) {
            boolean swapped = false;
            for (int j = 0; j < (size - i - 1); j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }
            swapCount++;
            if (!swapped)
                break;
        }
        System.out.println("Array setelah diurutkan:");
        for (int value : array) {
            System.out.print(value + " ");
    }
    System.out.println("\nhasil berapa kali swap: " + swapCount);
    }
}