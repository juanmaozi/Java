package learnstudy;
/*
 * 案例：数组遍历
 * 需求：设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[22,33,44,55,66]
 */

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个数组，用静态初始化完成
		int [] arr = {22,33,44,55,66};
		printArray(arr);
		

	}
	/*
	public static void printArray(int [] arr) {
		for(int x= 0;x<arr.length;x++) {
			System.out.println(arr[x]);
		}
	}
	*/
	public static void printArray(int [] arr) {
		System.out.print("[");
		for(int x= 0;x<arr.length;x++) {
			if(x == arr.length-1) { //如果是最后一个元素
				System.out.print(arr[x]);
			}else {
				System.out.print(arr[x]+"," );
			}
			
		}
		System.out.println("]");
	}
}
