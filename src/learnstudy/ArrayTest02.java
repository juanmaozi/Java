package learnstudy;
/*
 * 案例：评委打分，有六个评委，分数为0-100的整数分，选手最后得分为：去掉一个最低分和最高分的四个评委的平均值
 */
import java.util.Scanner;
public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义数组长度
		int [] arr = new int[6];
		//键盘输入六个数组
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个评委的打分");
		arr[0] =sc.nextInt();
		System.out.println("请输入第二个评委的打分");
		arr[1] =sc.nextInt();

		System.out.println("请输入第三个评委的打分");
		arr[2] =sc.nextInt();

		System.out.println("请输入第四个评委的打分");
		arr[3] =sc.nextInt();

		System.out.println("请输入第五个评委的打分");
		arr[4] =sc.nextInt();

		System.out.println("请输入第六个评委的打分");
		arr[5] =sc.nextInt();
		//调用三个方法
       int max= getMax(arr);
        int min =getMin(arr);
        int sum =Sum(arr);
        //求出平均分
        int number=(sum-min-max)/4;
        //输出平均分
        System.out.println("选手最终得分："+number);

	}
	//定义一个方法，求出数组的最大值
	public static int getMax(int [] arr) {
		int max=arr[0];
		for(int x =1;x<arr.length;x++) {
			if(arr[x]>max) {
				max =arr[x];
			}
			
		}return max;
	}
	//定义一个方法，求出数组的最小值
	public static int getMin(int [] arr) {
		int min=arr[0];
		for(int x =1;x<arr.length;x++) {
			if(arr[x]<min) {
				min =arr[x];
			}
			
		}return min;
	}
	//定义一个方法，求出数组的和
	public static int Sum(int [] arr) {
		int sum=0;
		for(int x=0;x<arr.length;x++) {
			sum +=arr[x];
		}
		return sum;
	}
	
}
