package learnstudy;
/*
 * 案例：不死神兔
 * 需求：假如有一对兔子，从出生后第三个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生了一对兔子
 * 假如都不死，问第二十个月的兔子对数为多少
 */

public class ImmortalRabbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个数组，用动态初始化完成数组的初始化，长度为20
		int [] arr = new int[20];
		arr[0] = 1;
		arr[1] = 1;

		for(int x=2 ; x<arr.length ; x++) {
			arr[x]=arr[x-2]+arr[x-1];
			
		}
		System.out.println("第二十个月兔子的对数是："+arr[19]);

	}

}
