package learnstudy;
/*
 * 案例：字符串反转
 * 需求：定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法，并在控制台输出结果
 * 
 * 
 */
import java.util.Scanner;
public class StringBuilderTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String line =sc.nextLine();

	}
	public static String myReverse(String s) {
		return s;
		//StringBuilder sb = new StringBuilder(s);
		//sb.reverse();
		//String ss = sb.toString();
		//return ss;
		//return new StringBuilder(s).reverse().toString();
	}
}
