package ch05.digui;
//验证volatile不保证原子性

public class volatileof {
    public static void main(String[] args) {
//        MyData data = new MyData();
//        for (int i = 0; i <= 10 ; i++) {
//            new Thread(() -> {
//
//            },String.valueOf(i)).start;
//        }
//    }
    }
}
class MyData {
    volatile int number = 0;

    public void addto60() {
        this.number = 60;
    }
    public void addPlusPlus() {
        number++;
    }
}