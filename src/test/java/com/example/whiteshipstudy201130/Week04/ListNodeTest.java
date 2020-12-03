package com.example.whiteshipstudy201130.Week04;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {

    int num=0;

    @Test
    void test(){
        ListNode node = new ListNode();
        assertNotNull(node);
    }

    @Test
    void test2(){
        ListNode node = new ListNode(0);
        assertAll(
                ()->assertNotNull(node),
                ()->assertEquals(node.add(node, new ListNode(100), 1).data, 100),
                ()->assertEquals(node.add(node, new ListNode(200), 2).data, 200),
                ()->assertEquals(node.add(node, new ListNode(300), 3).data, 300),
                ()->assertEquals(node.add(node, new ListNode(400), 4).data, 400),
                ()->assertTrue(node.contains(node, new ListNode(400))),
                ()->assertEquals(node.remove(node, 3).data, 300)
        );
    }

}