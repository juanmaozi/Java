package Static;

public class Student01 {
    public String name ;
    public int age;
//    public String university;
    public static String university;//static表示类下的共享变量
    public void show(){
        System.out.println(name+","+age+","+university);
    }
}
