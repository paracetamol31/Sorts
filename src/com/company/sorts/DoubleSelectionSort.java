package com.company.sorts;

public class DoubleSelectionSort<T extends Comparable<T>> {
   public T[] sort(T[] array){
       int begin = 0;
       int end = array.length-1;
       while (begin<end){

           int min = begin;
           int max = end;
           int it= begin;

           while (it<=end ){
               if(array[it].compareTo(array[max])>0) max = it;
               if(array[it].compareTo(array[min])<0) min = it;
               it++;
           }

           if(begin == max){
               max =min;
           }

           T tmp = array[begin];
           array[begin] = array[min];
           array[min] = tmp;

           tmp = array[end];
           array[end] = array[max];
           array[max] = tmp;

           begin++;
           end--;
       }
     return array;
   }
}
