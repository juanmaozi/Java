package MyExtends.ExtendsDemo01;
/*
继承
    格式： public class 子类名 extends 父类名{ }
    范例： public class Zi extends Fu { }
    继承中子类的特点：
    子类可以有父类的内容
    子类还可以有自己特有的内容
    继承中变量访问特点：
    在子类中访问一个变量
    1.子类局部范围找
    2.子类成员范围找
    3.父类成员范围找
    4.如果都没有就报错（不考虑父亲的父亲）
 */
//测试
public class extendDemo01 {
    public static void main(String[] args) {
        //创建对象，调用方法
        Fu f = new Fu();

        Zi z = new Zi();
        z.show();


    }
}
