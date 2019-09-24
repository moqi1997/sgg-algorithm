package ch08.singleton.test02;

public class SingletonTest05 {
     public static void main(String[] args) {
        System.out.println("懒汉式，线程安全的" +
                "效率很高");
        Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton1.equals(singleton2));
    }
}

class Singleton2 {
    //构造器私有化，外部能new
    private Singleton2() {

    }

    private  static volatile Singleton2 instance;


    public synchronized static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance =  new Singleton2();
                }
            }

        }
        return instance;
    }
}