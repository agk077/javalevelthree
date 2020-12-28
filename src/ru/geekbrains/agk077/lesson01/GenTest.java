package ru.geekbrains.agk077.lesson01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenTest {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3};
        String[] strArr = new String[]{"a", "b", "c"};

        swap(arr, 0, 2);
        System.out.println(Arrays.toString(arr));
        List list = new ArrayList(Arrays.asList(arr));
        System.out.println(list);

        System.out.println(asList(arr));

    }

    // Task 2. Написать метод, который преобразует массив в ArrayList;
    public static <T> List<T> asList(T... arr) {
        // способ используя специальный метод Arrays
        return new ArrayList<>(Arrays.asList(arr));

     /* способ через перебор массива по одному элементу
        List<T> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
      */
    }

    // 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    public static <T> void swap (T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
