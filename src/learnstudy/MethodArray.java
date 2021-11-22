package learnstudy;
/*
 * 案例：数组相同
 * 需求：设计一个方法，比较两组数组的内容是否相同
 */
public class MethodArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {11,22,33,44};
		int [] arr1 = {11,22,33,44};
		boolean flag = getYy(arr,arr1);
		System.out.println(flag);
	}
	public static boolean getYy(int [] arr, int[] arr1){
		if(arr.length!=arr1.length) {
			return false;
		}
		for(int x= 0;x<arr.length;x++) {
			if(arr[x]!= arr1[x]) {
				return false; 	
			}
		}
		return true;
	}


}