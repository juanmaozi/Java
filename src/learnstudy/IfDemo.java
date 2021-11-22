package learnstudy;
/*
 * If语句
 */
import java.util.Scanner;//导包
public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//创建对象
		System.out.println("请输入第一个数字：");
		int a = sc.nextInt() ;
		System.out.println("请输入第二个数字：");
		int b = sc.nextInt() ;
		//if语句
		if(a==b) {
			System.out.println("相同");
		}else {
			System.out.println("不相同");
		}
     System.out.println("---------");
     //奇偶数例子
     System.out.println("请输入数字：");
     int c = sc.nextInt();
     if(c % 2==0) { //% 2 取余运算符 判断余数是否=0，是则为偶数；
    	 System.out.println(c + "是偶数");
     }else { //余数不为0则为奇数；
    	 System.out.println(c + "是奇数");
     }
	}
	


}
