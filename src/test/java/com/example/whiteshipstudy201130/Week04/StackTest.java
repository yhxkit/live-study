package com.example.whiteshipstudy201130.Week04;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void test(){
        Stack stack = new Stack(5);
        assertNotNull(stack);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        assertAll(
                ()->assertEquals(stack.pop(), 5),
                ()->assertEquals(stack.pop(), 4),
                ()->assertEquals(stack.pop(), 3),
                ()->assertEquals(stack.pop(), 2),
                ()->assertEquals(stack.pop(), 1),
                ()->assertThrows(EmptyStackException.class, ()->stack.pop())

        );
    }

}