package com.soem;


public class App {

    public static void main(String[] args) {
        float startTime = System.currentTimeMillis();
        Bubble bs = new Bubble();
        Selection ss = new Selection();
        Insertion is = new Insertion();

        int[] data= {12,7,8,9,4,6,3,33,24,55,45,51,15,22,47,79};

        float endTime = System.currentTimeMillis();
        float timeTaken = (endTime - startTime);

        // bubblesorting

        System.out.printf("\nFunction took %.6f sec to execute.%n", timeTaken);
        System.out.println("\nSorted Array on Bubble Sort: ");
        bs.bubbeSort(data);
        
        //selectionsorting
        
        System.out.println("\n ============================");
        System.out.println("\nSorted Array on Selection Sort: ");
        ss.selectionSort(data);
       
        
        //Insertionsorting 

        System.out.println("\n ============================");
        System.out.println("\n Sorted Array on Insertion Sort: ");
        is.insertionSort(data);

    }
}
