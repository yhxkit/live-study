package com.example.whiteshipstudy201130.Week04;

public class Queue<T> {

    T[] element;

    void add(T t) {
        if (element == null) {
            element = (T[]) (new Object[1]);
            element[0] = t;
        } else {
            int size = element.length + 1;
            T[] arr = (T[]) (new Object[size]);

            for (int i = 0; i < element.length; i++) {
                arr[i] = element[i];
            }
            arr[element.length] = t;
            this.element = arr;
        }

    }

    T remove() throws Exception {
        if (element.length < 1) {
            throw new Exception();
        }

        T[] arr = (T[]) (new Object[element.length-1]);
        T result = element[0];

        for (int i = 1; i < element.length ; i++) {
            arr[i-1] = element[i];

        }
        this.element = arr;
        return result;
    }

}
