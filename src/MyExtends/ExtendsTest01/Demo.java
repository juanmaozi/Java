package MyExtends.ExtendsTest01;
/*
测试类
 */
public class Demo {
    public static void main(String[] args) {
        //创建老师类对象进行测试
        Teacher t = new Teacher();
        t.setName("李振鑫");
        t.setAge(22);
        System.out.println(t.getName()+","+t.getAge());
        t.teach();

        Teacher t2 = new Teacher("王老师",30);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();
    }
}
