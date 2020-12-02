package com.example.whiteshipstudy201130.Week04;

import java.util.EmptyStackException;

public class Stack {

    int size;
    int top;
    int[] element;

    public Stack(int size) {
        this.size = size;
        top = -1;
        element = new int[size];
    }

    void push(int data) {
        element[++top] = data;
    }

    int pop() {
        if(top < 0){
            throw new EmptyStackException();
        }
        int result = element[top];
        element[top--] = 0;
        return result;
    }

}
