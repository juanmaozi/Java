package learnstudy;
/*
 * 三元运算符（条件运算符）
 * 格式：变量布尔表达式 ? 表达式1 ： 表达式2
 */
public class OperatorDemo03 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//定义两个变量
		int a =10;
		int b =20;
		//获取俩个数据中的较大值
		int max = a > b ? a : b ;
		//输出结果
		System.out.println("较大值是：" + max);

		
	}

}
