package learnstudy;
/*
 * 带参数的方法练习
 * 设计一个方法用于打印两个数中的较大数，数据来自于方法参数
 */

public class MethodDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用常量
		getMax(10,20);
		//调用方法的时候，人家要几个，你就给几个；人家要什么类型的，你就给什么类型的；
		//错误示范
		//getMax(10);
		//geiMax(10.0,20.0);
		//使用变量
		int a = 20;
		int b = 10;
		getMax(a,b);

	}
	public static void getMax(int a ,int b ) {
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}

}
