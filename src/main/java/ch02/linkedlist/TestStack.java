package ch02.linkedlist;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
                System.out.println(stack.size());
                while (stack.size() > 0) {
                System.out.println(stack.pop());
                }
                }
                }
