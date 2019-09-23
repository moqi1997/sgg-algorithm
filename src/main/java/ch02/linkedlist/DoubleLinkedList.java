package ch02.linkedlist;

import java.util.HashMap;
import java.util.LinkedList;

public class DoubleLinkedList {
}
class dlln {
    private DoubleLinkedListNode head = new DoubleLinkedListNode(0," ", " ");

    public void add(DoubleLinkedListNode node) {
        DoubleLinkedListNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
        node.pre = temp;

    }
}
class DoubleLinkedListNode {
    public int no;
    public String name;
    public String nickname;
    public DoubleLinkedListNode next;
    public DoubleLinkedListNode pre;

    public DoubleLinkedListNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "DoubleLinkedListNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", next=" + next +
                ", pre=" + pre +
                '}';
    }
}