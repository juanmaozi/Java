package MyExtends.MethodRewriteDemo01;
/*
测试类
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone p =new Phone();
        p.call("李振鑫");
        System.out.println("------");
        NewPhone p1 =new NewPhone();
        p1.call("姚增清");
    }
}
