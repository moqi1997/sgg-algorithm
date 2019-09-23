package ch07.sort;


import java.util.ArrayList;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (listNode == null) {
            arrayList.add(0);
            return arrayList;
        }
        while (listNode.next != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.empty()) {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);

        ListNode head4 = new ListNode(5);

        head4 = listNode.next;


        Solution solution = new Solution();

        System.out.println( solution.printListFromTailToHead(listNode));
    }
}