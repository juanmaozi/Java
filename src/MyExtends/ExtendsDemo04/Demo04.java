package MyExtends.ExtendsDemo04;
/*
通过子类对象访问一个方法：
子类成员范围找
父类成员范围找
如果都没有就报错
 */
public class Demo04 {
    public static void main(String[] args) {
        Zi z =new Zi();
        z.method();
        z.show();
        //报错       z.test();

    }
}
