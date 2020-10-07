package com.company;

import com.company.sorts.DoubleSelectionSort;

public class Main   {

    public static void main(String[] args) {
        DoubleSelectionSort<Double> doubleSelectionSort = new DoubleSelectionSort<>();
       Double[] arr = {1.5,2.324,5.234 ,2.23,1.324,3.234,4.324,0.0};
       arr= doubleSelectionSort.sort(arr);
    }
}
