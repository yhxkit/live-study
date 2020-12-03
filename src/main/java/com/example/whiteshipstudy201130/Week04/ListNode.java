package com.example.whiteshipstudy201130.Week04;

import java.util.Objects;

public class ListNode {

    int data;
    ListNode next;

    public ListNode(int data){
        this.data=data;
    }

    public ListNode(){
    }

    ListNode add(ListNode head, ListNode nodeToAdd, int position){
        ListNode node = head;
        for(int i =0; i<position-1; i++){
            node=node.next;
        }
        nodeToAdd.next = node.next;
        node.next = nodeToAdd;
        return nodeToAdd;
    }

    static ListNode remove(ListNode head, int positionToRemove) {
        ListNode target = head.next;
        ListNode before = head;
        for (int i = 0; i < positionToRemove - 1; i++) {
            before = target;
            target = target.next;
        }
        before.next = target.next;
        return target;
    }


    boolean contains(ListNode head, ListNode nodeTocheck){
        ListNode node = head;
        while(node != null){
            if(node.equals(nodeTocheck)){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListNode)) return false;
        ListNode listNode = (ListNode) o;
        return data == listNode.data && Objects.equals(this.next, listNode.next);
    }


}
