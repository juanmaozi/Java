package learnstudy;
/*
 * 案例：数组求和
 */
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {68,27,95,88,171,996,51,210};
		int sum =0 ;
		for(int x =0;x<arr.length;x++) {
			if(arr[x]%10!=7 && arr[x]/10%10!=7 && arr[x]%2==0) {
				sum += arr[x];
			}
		}
		System.out.println("SUM:"+sum);

	}

}
