package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

/*
案例：学生管理系统
主界面

equals 用于字符串内容比较
 */
public class ManagementSystem {
    public static void main(String[] args) {
        //创建集合对象，用于存储学生对象
        ArrayList<Student> array = new ArrayList<Student>();
        //使用循环再次回到主页面
        while (true) {
            //主页面的编写
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            //键盘输入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //Switch语句完成操作
            switch (line) {
                case "1":
                    System.out.println("添加学生");
                    addSturdent(array);
                    break;
                case "2":
                    System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                    System.out.println("修改学生");
                    amendStudent(array);
                    break;
                case "4":
                    System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    //  break;
                    System.exit(0);//JVM虚拟机退出
            }
        }
    }


    /*
    public static void addSturdent(ArrayList<Student> array) {
        //键盘录入学生对象所需要的数据，显示提示信息，提示要输入何种信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生学号：");
        String number = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();
        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        s.setNumber(number);
        s.setAddress(address);
        //将学生对象添加到集合中
        array.add(s);
        //给出添加成功提示
        System.out.println("添加成功");

    }

     */
    //定义一个方法，用于添加学生信息
    public static void addSturdent(ArrayList<Student> array) {
        //键盘录入学生对象所需要的数据，显示提示信息，提示要输入何种信息
        Scanner sc = new Scanner(System.in);
        //为了让number在while循环外面被访问到，我们就把它定义在了循环外面
        String number;
        while (true){
            System.out.println("请输入学生学号：");
             number = sc.nextLine();
            boolean flag =isUsed(array,number);
            if (flag){
                System.out.println("你输入的学号已经被使用，请重新输入");
            }else {
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();

        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();
        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        s.setNumber(number);
        s.setAddress(address);
        //将学生对象添加到集合中
        array.add(s);
        //给出添加成功提示
        System.out.println("添加成功");

    }
    //定义一个方法，判断学号是否重复
    public static boolean isUsed(ArrayList<Student> array,String number){
        //如何与集合中的某个学生学号相同，返回true，如果都不相同，返回false
        boolean flag = false;
        for (int i=0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getNumber().equals(number)){
                flag = true;
                break;

            }
        }
        return flag;
    }
    //定义一个方法，用于查看所有学生信息
    public static void findAllStudent(ArrayList<Student> array) {
        //判断集合中是否有数据，如果没有显示提示信息
        if (array.size() == 0) {
            System.out.println("无信息，请先添加信息再查询");
        } else {
            //显示表头信息
            // \t 其实就tab键的位置
            System.out.println("姓名\t\t年龄\t\t学号\t\t\t居住地");
            //将集合中的数据取出按照对应格式显示学生信息，年龄显示补充“岁”
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(s.getName() + "\t" + s.getAge() + "岁\t" + s.getNumber() + "\t" + s.getAddress());
            }
        }
    }
    //定义一个方法，用于删除学生信息
    public static void deleteStudent(ArrayList<Student> array){
        //显示提示信息
        System.out.println("请输入你要删除的学生学号");
        //键盘录入要删除的学生学号
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        //遍历集合将对应的学生对象从集合中删除
        //定义索引值为-1;
        int index =-1;
        for (int i = 0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getNumber().equals(number)){
//                int index = i;
                index = i;
                break;
            }
        }
        //判断
        if (index==-1){
            System.out.println("该信息不存在，请重新输入");
        }else{
            array.remove(index);
            //给出删除成功的提示信息
            System.out.println("删除学生成功");
        }

    }
    //定义一个方法，用于修改学生信息
    public static void amendStudent(ArrayList<Student> array){
        //显示提示信息
        System.out.println("请输入你要修改的学生学号");
        //键盘录入要修改的学生学号
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        //键盘录入要修改的学生信息
        System.out.println("请输入新的学生姓名");
        String name= sc.nextLine();
        System.out.println("请输入新的学生年龄");
        String age =sc.nextLine();
        System.out.println("请输入新的学生居住地");
        String address =sc.nextLine();
        //创建学生对象
        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        s.setNumber(number);
        s.setAddress(address);
        //遍历集合修改对应的学生信息
        for (int i = 0 ;i< array.size();i++){
            Student student = array.get(i);
            if(student.getNumber().equals(number)){
                array.set(i,s);
                break;
            }
        }
        //给修改成功的提示
        System.out.println("修改学生成功");

    }
}
