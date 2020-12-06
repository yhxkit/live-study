package com.example.whiteshipstudy201130.Week04;

public class QueueWithListNode {

    ListNode head;
    int size;

    public QueueWithListNode(){
        head = new ListNode();
        size = 0;
    }

    void add(int data){
        ListNode node = new ListNode(data);
        size++;
        node.add(head, node, size);
    }

    int remove() throws Exception{
        if (size < 1) {
            throw new Exception();
        } else {
            ListNode node = head.remove(head, 1);
            size--;

            return node.data;
        }

    }

}
