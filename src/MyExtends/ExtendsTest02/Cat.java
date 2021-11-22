package MyExtends.ExtendsTest02;

public class Cat extends Animal {
    public Cat() {
    }
    public Cat(String name,int age){
        super(name, age);
    }
    public  void  bu(){
        System.out.println("抓老鼠");
    }
}
