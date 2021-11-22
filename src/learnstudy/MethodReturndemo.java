package learnstudy;
/*
 * 带返回值方法练习
 * 设计一个方法可以获取俩个数的较大值，数据来自参数
 */
public class MethodReturndemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = getMax(19,29);
				System.out.println("较大值为"+result);
				//也可以直接打印结果
				//System.out.println(getMax(19,29));
	}
	public static int getMax(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}

}
