package ArrayList;
/*
学生遍历升级版的学生类
 */
public class ArrayStudent01 {
    private String name;
    private int age;
    public ArrayStudent01(){}

    public  ArrayStudent01(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
