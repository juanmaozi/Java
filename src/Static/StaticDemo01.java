package Static;
/*
static修饰的特点：
1.被类的所有对象共享
  这也是我们判断是否使用静态关键字的条件
2.可以通过类名调用（推荐）
  也可以通过对象名调用

 */
public class StaticDemo01 {
    public static void main(String[] args) {
        Student01.university="杭电信工";

        Student01 s1 =new Student01();
        s1.name="李振鑫";
        s1.age=22;
//        s1.university="杭电信工";
        s1.show();

        Student01 s2 =new Student01();
        s2.name="姚增清";
        s2.age=21;
//        s2.university="杭电信工";
        s2.show();

    }
}
