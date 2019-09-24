package ch08.singleton;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton1.equals(singleton2));
    }
}

//懒汉式（静态变量）
class Singleton {
    //构造器私有化，外部能new
    private Singleton() {

    }
    //本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}