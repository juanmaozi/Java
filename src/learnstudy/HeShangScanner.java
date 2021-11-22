package learnstudy;
/*
 * 需求：三个和尚身高需要测量，求出最高的身高
 */

import java.util.Scanner;
public class HeShangScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建对象
		Scanner sc = new Scanner(System.in);
		//键盘录入三个身高，并赋值给三个变量
		System.out.println("请输入第一个和尚的身高：");
		int height1 = sc.nextInt();
		System.out.println("请输入第二个和尚的身高：");
		int height2 = sc.nextInt();
		System.out.println("请输入第三个和尚的身高：");
		int height3 = sc.nextInt();
		//用条件运算符进行身高比较
		int a = (height1>height2) ? height1:height2 ;
		int b = (height3>height2) ? height3:height2 ;
		int c = (a>b)? a:b;
		//输出结果
		System.out.println("身高最高的是："+ c + "cm");		

	}

}
