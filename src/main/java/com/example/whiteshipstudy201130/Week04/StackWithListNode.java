package com.example.whiteshipstudy201130.Week04;

import java.util.EmptyStackException;

public class StackWithListNode {

    int size;
    int top;
    ListNode element;

    public StackWithListNode() {
        element = new ListNode();
        size = 0;
        top = 0;
    }


    void push(int data) {
        ListNode node = new ListNode(data);
        node.add(element, node, top);
        size++;
        top++;

    }

    int pop() {
        if (size < 1) {
            throw new EmptyStackException();
        } else {
            ListNode node = element.remove(element, top);
            size--;
            top--;

            return node.data;
        }
    }


}
