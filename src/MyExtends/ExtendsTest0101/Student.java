package MyExtends.ExtendsTest0101;

public class Student extends Person{
    public  Student(){

    }
    public Student(String name,int age){
        super(name, age);
    }
    public void learn(){
        System.out.println("最难不过坚持");
    }
}
