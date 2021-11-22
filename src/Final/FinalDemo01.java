package Final;
/*
final修饰局部变量
变量是基本类型：final修饰指的是基本类型的数据值不能改变
变量是引用类型:final修饰指的是引用类型的地址值不能发生改变，但是地址里面的内容是可以改变的
 */
public class FinalDemo01 {
    public static void main(String[] args) {
        //final修饰基本类型变量
        final int age =20;
//        age =100;
        System.out.println(age);


        //final修饰引用类型变量
        final Student s =new Student();
        s.age=100;
        System.out.println(s.age);
//        s = new Student();
    }
}
