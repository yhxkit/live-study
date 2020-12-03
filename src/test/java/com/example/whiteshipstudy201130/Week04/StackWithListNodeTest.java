package com.example.whiteshipstudy201130.Week04;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class StackWithListNodeTest {

    @Test
    void test(){
        StackWithListNode stack = new StackWithListNode();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        assertAll(
                ()->assertEquals(stack.pop(),5),
                ()->assertEquals(stack.pop(),4),
                ()->assertEquals(stack.pop(),3),
                ()->assertEquals(stack.pop(),2),
                ()->assertEquals(stack.pop(),1),
                ()->assertThrows(EmptyStackException.class, ()->stack.pop())

        );
    }

}