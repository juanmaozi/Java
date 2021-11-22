package MyExtends.ExtendsDemo04;

public class Zi extends Fu{
    public void method(){
        System.out.println("Zi中method()方法被调用");
    }
    public  void show(){
        super.show();//先调用父类中的show，再调用子类中的show
        System.out.println("Zi中show()方法被调用");
    }
}
