package learnstudy;
/*
 * 案例：数组最大值
 * 需求：设计一个方法用于获取数组中元素的最大值，调用并输出结果
 */
public class ArrayTest01 {
	public static void main(String[] args) {
		int [] arr = {22,33,44,55,66};
		int number =getMax(arr);
		System.out.println("最大值为："+ number);
	}
	public static int getMax(int [] arr) {
		int max = arr[0];
		for(int x=1;x<arr.length;x++) {
			if(arr[x] > max) {
				max  =arr[x];
			}
		}
		return max;
	}

}
