package ArrayList;
/*
案例：学生存储升级版  学生的姓名和年龄来自键盘输入
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest03 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<ArrayStudent01> arr = new ArrayList<ArrayStudent01>();
        addStudent(arr);
        addStudent(arr);
        addStudent(arr);
        //遍历集合
        for(int i = 0;i< arr.size();i++){
            ArrayStudent01 s= arr.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }

    }
    public static void addStudent(ArrayList<ArrayStudent01> arr){
        //键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name =sc.nextLine();
        System.out.println("请输入学生年龄：");
        int age =sc.nextInt();
        //创建学生对象，把键盘输入的数据赋值给学生对象的成员变量
        ArrayStudent01 s = new ArrayStudent01();
        s.setName(name);
        s.setAge(age);
        //往集合中添加学生对象
        arr.add(s);
    }
}
