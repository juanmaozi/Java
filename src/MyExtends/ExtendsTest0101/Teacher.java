package MyExtends.ExtendsTest0101;

public class Teacher extends Person{
    public Teacher(){

    }
    //带参构造方法
    public Teacher(String name,int age){
        //不能直接调用父类中，要用super
//        this.name=name;
//        this.age=age;
        super(name, age);
    }
    public  void teach(){
        System.out.println("用爱感化学生");
    }
}
