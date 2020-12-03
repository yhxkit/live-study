package com.example.whiteshipstudy201130.Week04;

import java.util.EmptyStackException;

public class StackWithListNode {

    int size;
    ListNode element;

    public StackWithListNode() {
        element = new ListNode();
        size = 0;
    }


    void push(int data) {
        ListNode node = new ListNode(data);
        size++;
        node.add(element, node, size);

    }

    int pop() {
        if (size < 1) {
            throw new EmptyStackException();
        } else {
            ListNode node = element.remove(element, size);
            size--;

            return node.data;
        }
    }



}
