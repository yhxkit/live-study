package com.example.whiteshipstudy201130.Week04;

public class ListNode {

    int data;
    ListNode next;

    public ListNode(int data){
        this.data=data;
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

    ListNode remove(ListNode head, int positionToRemove){
        ListNode node = head;
        for(int i =0 ; i<positionToRemove-2; i++){
            node = node.next;
        }
        ListNode remove = node.next;
        node.next = remove.next;
        return remove;
    }

    boolean contains(ListNode head, ListNode nodeTocheck){
        ListNode node = head;
        while(node.next != null){
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
        return data == listNode.data &&
                next.equals(listNode.next);
    }

}
