package com.company.sorts;

public class CocktailSort <T extends Comparable<T>> {
    public T[] sort(T[] array){
         if(array.length==0 || array.length==1 ){
             return array;
         }
         int rememberIndex =  0 ;
         int  lowerLimit = 0; // нижняя грница
         int  upperLimit = array.length-1; // верхняя грница

        while (lowerLimit<upperLimit) {
            for (int i = lowerLimit; i < upperLimit;i++) {
                int j = i +1;
                if (array[i].compareTo(array[j]) > 0) {
                    T tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                    rememberIndex = j;
                }
            }
            upperLimit =rememberIndex;
            for (int i = upperLimit; i > lowerLimit;i--) {
                int j = i -1;
                if (array[i].compareTo(array[j]) < 0) {
                    T tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                    rememberIndex = j;
                }
            }
            lowerLimit = rememberIndex;
        }
        return array;
    }
}
