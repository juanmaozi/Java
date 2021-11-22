package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
案例：存储学生对象并遍历
需求：创建一个存储学生对象的集合，存储三个学生对象，使用程序实现在控制台遍历该集合

思路：
1.定义学生类
2.创建集合对象
3.创建学生对象
4.添加学生对象到集合中
5.遍历集合，采用通用遍历格式实现
 */
public class ArrayListTest02 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<ArrayStudent> arr = new ArrayList<ArrayStudent>();

        //创建学生对象
        ArrayStudent s1 = new ArrayStudent("李振鑫",22);
        ArrayStudent s2 = new ArrayStudent("张三",21);
        ArrayStudent s3 = new ArrayStudent("李四",20);
        //添加学生对象到集合中
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        //遍历集合，采用通用遍历格式实现
        for (int i =0;i< arr.size();i++){
            ArrayStudent s =arr.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }




    }
}
