package ch06.inversion;

public class DependecyInversion2 {
    public static void main(String[] args) {
        Person1 person = new Person1();
        person.receive(new Email1());
        person.receive(new WeChat());
    }
}
interface IRecerver {
    public String getInfo();
}
class Email1 implements IRecerver {
    public String getInfo() {
        return "电子邮箱信息： hello,world";
    }
}
class WeChat implements IRecerver {

    public String getInfo() {
        return "微信信息 hello";
    }
}
class Person1 {
    //这里我们是对接口依赖
    public void receive(IRecerver recerver) {
        System.out.println(recerver .getInfo());
    }
}