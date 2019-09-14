package ch02.linkedlist;

public class SingleLiskedList {
    //链表长度
    static int getLength(HeroNode heroNode) {
        if (heroNode.next == null) {
            return 0;
        }
        int length = 0;
        //定义一个辅助的变量，这里我们没有统计头节点
        HeroNode cur = heroNode.next;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        return length;
    }
    static void reverserList(HeroNode node) {
        if (node.next == null || node.next.next == null) {
            return;
        }
        HeroNode cur = node.next;
        HeroNode next = null;
        HeroNode reverseHead = new HeroNode(0,"","");

        while (cur != null) {
            next = cur.next;
            cur.next = reverseHead.next;
            reverseHead.next = cur;
            cur = next;
        }
        node.next = reverseHead.next;
    }
    public static void main(String[] args) {
        //测试
        HeroNode heroNode = new HeroNode(1, "宋江", "及时雨");
        HeroNode heroNode1 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode heroNode2 = new HeroNode(3, "无用", "玉麒麟");

        SingleLinkList singleLinkeList = new SingleLinkList();
        singleLinkeList.add(heroNode);
        singleLinkeList.add(heroNode1);
        singleLinkeList.add(heroNode2);
        singleLinkeList.show();
        System.out.println(getLength(singleLinkeList.getHead()));
        reverserList(singleLinkeList.getHead());
        singleLinkeList.show();
    }
}
//定义单链表
class SingleLinkList {
    //初始化头节点
    private HeroNode head = new HeroNode(0," ", " ");

    public void add(HeroNode node) {
      HeroNode temp = head;
      while (true) {
          if (temp.next == null) {
              break;
          }
          temp = temp.next;
      }
        temp.next = node;
    }

    public HeroNode getHead() {
        return head;
    }

    public void show() {
        if (head.next == null) {
            System.out.println("链表为空！");
            return;
        }
        HeroNode temp = head.next;
       while (true) {
           if (temp == null) {
               break;
           }
           System.out.println(temp);
           temp = temp.next;
       }

    }

}
//定义HereNode,每一个HeroNode 对象是一个节点
class HeroNode {
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }
}