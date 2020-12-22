package com.company.sorts;

public class QuickSort<T extends  Comparable<T>>  {
    public T[] sort(T[] array, int left, int right) {
        T pivot = array[left + (right - left) / 2];
        int l = left;
        int r = right;
        while (l <= r) {
            while (array[l].compareTo(pivot) < 0) l++;
            while (array[r].compareTo(pivot) > 0) r--;
            if (l <= r) {
                T tmp = array[l];
                array[l] = array[r];
                array[r] = tmp;
                l++;
                r--;
            }
        }
        if (left < r)
            array = sort(array, left, r);
        if (l < right)
            array = sort(array, l, right);
        return array;
    }
}
