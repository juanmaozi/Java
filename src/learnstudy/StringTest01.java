package learnstudy;

import java.util.Scanner;

/*
 * 案例：用户登录
 * 需求：已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应提示
 * 思路：
 * 1.已知用户名和密码，定义两个字符串表示即可
 * 2.键盘录入要登录的用户名和密码
 * 3.拿键盘录入的用户名、密码和已知的用户名、密码进行比较，给出相应提示
 * 字符串的内容比较用equals()方法实现
 * 4.用循环实现多次机会，这里的此时明确，采用for循环实现，并在登录成功的时候，使用break接受循环 
 * 
 */


public class StringTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "xiaoli";
		String password = "123456";
		
		for(int i=0;i<3;i++) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name = sc.nextLine();
		System.out.println("请输入密码：");
		String word = sc.nextLine();
		
		if(name.equals(username) && word.equals(password)) {
			System.out.println("登录成功");
			break;
		}else {
			if(2-i == 0) {
				System.out.println("你的账号被锁定，请与管理员联系");
			}else{
			System.out.println("登录失败，你还有"+(2-i)+"次机会");
		}

	}
	}
	}}

