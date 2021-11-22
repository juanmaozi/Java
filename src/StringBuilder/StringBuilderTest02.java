package StringBuilder;

import java.util.Scanner;

/*
案例：字符串反转
需求：定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
 */
public class StringBuilderTest02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        String s =toReverse(line);
        System.out.println("s:"+s);
    }
    public static String toReverse(String s){
       // StringBuilder sb = new StringBuilder(s);
       // sb.reverse();
       // String ss = sb.toString();
        // return ss;
        //化简：匿名
       return new StringBuilder(s).reverse().toString();
    }
}
