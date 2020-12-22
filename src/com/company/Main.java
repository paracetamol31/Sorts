package com.company;

import com.company.sorts.CocktailSort;
import com.company.sorts.DoubleSelectionSort;
import com.company.sorts.QuickSort;

public class    Main   {

    public static void main(String[] args) {
        CocktailSort<Double> cocktailSort = new CocktailSort<>();
        Double[] arr1 = {1.5,2.324,5.234 ,2.23,1.324,3.234,4.324,0.0};
        arr1 = cocktailSort.sort(arr1);

        DoubleSelectionSort<Double> doubleSelectionSort = new DoubleSelectionSort<>();
        Double[] arr = {1.5,2.324,5.234 ,2.23,1.324,3.234,4.324,0.0};
        arr= doubleSelectionSort.sort(arr);

        QuickSort<Integer> quickSort = new QuickSort<>();
        Integer[] arr2 = {1,1, 1, 0, 4, 9, 9, 3 ,7, 8, 8, 8};
        arr2 = quickSort.sort(arr2, 0 , arr2.length-1);
    }
}
