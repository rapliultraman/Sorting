package com.soem;

public class Selection {

    public void selectionSort(int array[]) {
        int size = array.length;
        int swapCount = 0;

        for(int step = 0; step < size - 1; step++){
            int min_idx = step;

            for(int i = step + 1; i < size; i++ ){
                if (array[i] < array[min_idx]){
                    min_idx = i;
                }
            }
            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
            swapCount++;
        } 
        System.out.println("Array setelah diurutkan:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println("\nhasil berapa kali swap: " + swapCount);
    }
}
