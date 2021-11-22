package MyExtends.ExtendsTest0101;
/*

 */
public class Demo {
    public static void main(String[] args) {
        //创建老师类对象，并进行测试
        Teacher t1 =new Teacher();
        t1.setName("王老师");
        t1.setAge(30);
        System.out.println(t1.getName()+","+ t1.getAge());
        t1.teach();
        Teacher t2 =new Teacher("刘老师",33);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();
        System.out.println("---------");

        Student s1 =new Student();
        s1.setName("李振鑫");
        s1.setAge(18);
        System.out.println(s1.getName()+","+s1.getAge());
        s1.learn();
        Student s2 =new Student("姚同学",18);
        System.out.println(s2.getName()+","+s2.getAge());
        s2.learn();


    }
}
