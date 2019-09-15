package ch03.AarryStack;

import java.util.Scanner;

public class aStack {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(4);
        int key = 0;
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        while (loop) {
            System.out.println("1 ： 表示显示栈");
            System.out.println("4 ： 退出");
            System.out.println("2 ：添加栈");
            System.out.println("3 ： 取栈");
        key = scanner.nextInt();
        switch (key) {
            case 1:
                stack.show();
                break;
            case 2:
                System.out.println("请添加数据");
                int value = scanner.nextInt();
                stack.push(value);
                break;
            case 3:
                stack.pop();
                break;
            case 4:
            scanner.close();
            loop = false;
            break;
        }
        }
    }
}

class ArrayStack {
    private int maxSize;
    private  int[] stack;
    private  int top = -1;

    //构造器
    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }
    //栈满
    public boolean isFull() {
        return  top == maxSize - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void push(int value) {
        if (isFull()) {
            System.out.println("栈满");
            return;
        }
        top++;
        stack[top] = value;
    }
    public int pop() {
        //先判断栈是否空
        if (isEmpty()) {
            throw new RuntimeException("栈空，没有数据！");
        }
        int value = stack[top];
        top--;
        return value;
    }
    public void show() {
        if (isEmpty()) {
            System.out.println("栈空，没有数据！");
        }
        int flag = top;
        int value = 0;
        while (flag >= 0) {
            value = stack[flag];
            System.out.println("stack["+ flag + "] " + value);
            flag--;
        }
    }
}