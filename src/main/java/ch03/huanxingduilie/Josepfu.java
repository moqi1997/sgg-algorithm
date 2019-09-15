package ch03.huanxingduilie;

public class Josepfu {
    public static void main(String[] args) {
            //测试
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        circleSingleLinkedList.addBoy(5);
        circleSingleLinkedList.showBoy();
    }
}
class CircleSingleLinkedList {
    //创建一个first节点
    private Boy first = new Boy(-1);
    //添加一个小孩节点，构建成一个环形的链表
    public void addBoy(int nums) {
        //nums 做一个数据校验
        if (nums < 1) {
            System.out.println("nums的值不正确");
        }
        //创建辅助指针
        Boy curBoy = null;
        for (int i = 1; i < nums; i++) {
            Boy boy = new Boy(i);
            if (i == 1) {
                first = boy;
                first.setNext(first);
                curBoy = first;
            }else {
                curBoy.setNext(boy);
                boy.setNext(first);
                curBoy = boy;
            }
        }
    }
    //遍历当前链表
    public void showBoy() {
        if (first == null) {
            System.out.println("链表为空！");
        }
        Boy cur = first;
        while (true) {
            System.out.printf("小孩的编号 %d \n", cur.getNo());
            if (cur.getNext() == first) {
               break;
            }
            cur = cur.getNext();
        }
    }
    //根据用户的输入，计算出小孩出圈的顺序
    /*
    * startNo 表示从第几个小孩开始数数
    * countNum 表示数几下
    * nums 表示最初有多少小孩在圈中
    * */
    public void countBoy(int starNo, int countNum, int nums) {
        if (first == null || starNo < 1 || starNo > nums) {
            System.out.println("s输入有误");
            return;
        }
        Boy helper = first;
        while (true) {

        }
    }
}

class Boy {
    private int no;
    private Boy next;

    public Boy(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }
}
