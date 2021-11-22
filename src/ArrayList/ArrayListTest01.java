package ArrayList;

import java.util.ArrayList;

/*
案例：存储字符串并遍历
需求：创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合
思路：
1.创建集合对象
2.往集合中添加字符串对象
3.遍历集合，首先要能够获取到集合中的每一个元素，这个通过get(int index)方法实现
4.遍历集合，其次要能够获取待集合的长度，这个通过size()方法实现
5.遍历集合的通用格式
        for(int i=0;i<集合对象.size();i++){
        集合对象.get(i) 就是指定索引处的元素
        }
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        //1.创建集合对象
        ArrayList<String> arr = new ArrayList<>();
        //2.往集合中添加字符串对象
        arr.add("李振鑫");
        arr.add("张三");
        arr.add("李四");
        //3.遍历集合，首先要能够获取到集合中的每一个元素，这个通过get(int index)方法实现
//        System.out.println(arr.get(0));
//        System.out.println(arr.get(1));
//        System.out.println(arr.get(2));
        for (int i = 0;i<arr.size();i++){
           String s = arr.get(i);
           System.out.println(s);
           //可以直接输出
//           System.out.println(arr.get(i));

        }


    }
}
