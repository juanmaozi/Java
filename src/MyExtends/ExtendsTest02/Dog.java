package MyExtends.ExtendsTest02;

public class Dog extends Animal{
    public Dog() {
    }
    public Dog(String name,int age){
        super(name, age);
    }
    public void kanmen(){
        System.out.println("看门");
    }
}
