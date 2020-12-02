package com.example.whiteshipstudy201130.Week04;

import java.util.EmptyStackException;

public class StackWithListNode {

    int size;
    int top;
    ListNode element;

    void push(int data) {
        ListNode node = new ListNode(data);

        if (element == null) {
            element = node;
            size = 1;
            top = 1;
        } else {
            ListNode last = element;
            int num = 0;

            while (last != null) {
                last = last.next;
                num++;
            }

            size = num;
            top = num;

            last.next = node;
        }

    }

    int pop() {
        if (element == null) {
            throw new EmptyStackException();
        } else {
            ListNode before = element;
            ListNode last = element.next;
            int num = 1;

            while (last != null) {
                before = last;
                last = last.next;
                num++;
            }

            num--;
            size = num;
            top = num;

            before.next = null;
            return last.data;
        }
    }

}
