package StringBuilder;
/*
 StringBuilder 转换为String
 public String toString():通过toString()就可以实现StringBuilder转化为Stirng
 String 转化为 StringBuilder
 public StringBuilder(String s):通过构造方法就可以实现把 String转换为StringBuilder
 */
public class StringBuilderDemo03 {
    public static void main(String[] args) {
        /*
        // StringBuilder 转换为String
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        //public String toString():通过toString()就可以实现StringBuilder转化为Stirng
        String s = sb.toString();
        System.out.println(s);
         */
        // String 转化为 StringBuilder
        String s = "hello";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);



    }
}
