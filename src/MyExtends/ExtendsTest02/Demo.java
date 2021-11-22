package MyExtends.ExtendsTest02;

public class Demo {
    public static void main(String[] args) {
        Dog d =new Dog("小黄",2);
        System.out.println("小狗的名字："+d.getName()+","+d.getAge()+"岁");
        d.kanmen();
        Cat c =new Cat("小白",1);
        System.out.println("小猫的名字："+c.getName()+","+c.getAge()+"岁");
        c.bu();

    }
}
