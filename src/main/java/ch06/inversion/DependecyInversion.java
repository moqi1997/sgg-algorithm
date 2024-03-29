package ch06.inversion;

public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮箱信息： hello,world";
    }
}

class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}