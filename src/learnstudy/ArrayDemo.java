package learnstudy;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//数组静态初始化
		//格式：数据类型 [] 变量名 = new 数据类型 []{数据1，数据2}
		int [] b = new int[] {1,2,3};
		//静态初始化简化
		int [] b = {1,2,3};
		*/
		
		//数组动态初始化
		int [] a = new int[3];
		/*
		 左边：
		 int：该数组中的元素类型是int类型
		 []：说明这是一个数组
		 a：这是数组的名称
		 右边：
		 new：为数组申请内存空间
		 int：该数组中的元素类型是int类型
		 []：说明这是一个数组
		 3:数组长度，其实就是数组的元素个数		 
		 */
		//计算机计数是从0开始
		//存入数组元素，给赋值
		a[0] = 1;
		a[1] = 2;
		a[2] = 5;
		//输出数组名
		System.out.println(a);
		//输出数组中的元素	
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

	}

}
