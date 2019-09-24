package ch08.singleton;

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton1.equals(singleton2));
    }
}

//懒汉式（静态变量）
class Singleton1 {
    //构造器私有化，外部能new
    private Singleton1() {

    }

    private  static Singleton1 instance;
    static {
        instance = new Singleton1();
    }

    public static Singleton1 getInstance() {
        return instance;
    }
}