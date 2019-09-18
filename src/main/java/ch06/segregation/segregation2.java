package ch06.segregation;
/*
*
* 接口隔离原则
* */
public class segregation2 {

    public static void main(String[] args) {
        A a = new A();
        a.depend1(new C());
        a.depend2(new C());
        a.depend3(new C());
        B b = new B();
        b.depend1(new D());
        b.depend4(new D());
        b.depend5(new D());
    }
}

interface Interface1 {
    void iperation1();
}
interface Interface2 {
    void iperation2();
    void iperation3();
}
interface Interface3 {
    void iperation4();
    void iperation5();
}
class C implements Interface1,Interface2 {

    public void iperation1() {
        System.out.println("C 实现了 operation1");
    }

    public void iperation2() {
        System.out.println("C 实现了 operation2");
    }

    public void iperation3() {
        System.out.println("C 实现了 operation3");
    }
}
class D implements Interface1 ,Interface3{


    public void iperation1() {
        System.out.println("D 实现了 operation1");
    }

    public void iperation4() {
        System.out.println("D 实现了 operation4");
    }

    public void iperation5() {
        System.out.println("D 实现了 operation5");
    }
}
class A {
    public void depend1(Interface1 interface1) {
        interface1.iperation1();
    }
    public void depend2(Interface2 interface1) {
        interface1.iperation2();
    }
    public void depend3(Interface2 interface1) {
        interface1.iperation3();
    }
}
class B {
    public void depend1(Interface1 interface1) {
        interface1.iperation1();
    }
    public void depend4(Interface3 interface1) {
        interface1.iperation4();
    }
    public void depend5(Interface3 interface1) {
        interface1.iperation5();
    }
}