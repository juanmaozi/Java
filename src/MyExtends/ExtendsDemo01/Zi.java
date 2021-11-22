package MyExtends.ExtendsDemo01;

public class Zi extends Fu {
    public int height =175 ;
    public int age =20;
    public  void  show(){
        int age =30;
        //在方法中使用一个变量的时候，先在方法内部寻找，再去本类中查找，再去父类
        System.out.println(age);
        System.out.println(height);
        //报错
//        System.out.println(Weight);
    }
}
