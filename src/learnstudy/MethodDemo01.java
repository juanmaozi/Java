package learnstudy;
/*
 * 方法练习；设计一个方法用于打印两个数中的较大数
 */
import java.util.Scanner;
public class MethodDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//方法调用
		getMax();

	}
	public static void getMax() {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int number1=sc.nextInt() ;
		System.out.println("请输入第二个数字");
		int number2=sc.nextInt() ;
		//条件比较符
		int max  = number1>number2? number1:number2;
		System.out.println("较大数为："+max);
		
	}

}
