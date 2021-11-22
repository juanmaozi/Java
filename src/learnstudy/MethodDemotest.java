package learnstudy;
/*
 * 带参数方法联系：
 * 设计一个方法用于打印两个数中的较大数，数据来自方法参数
 */

public class MethodDemotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 29;
		int b = 20;
		getMax(a,b);

	}
	public static void getMax(int a, int b) {
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}

}
