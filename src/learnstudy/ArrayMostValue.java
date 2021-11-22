package learnstudy;
/*
 * 数组中获取最值操作
 */

public class ArrayMostValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number = {555,111,122,143,122};
		int max =0 ;//最大值
		int min =0 ;//最小值
		max=min=number[0];//把第一个元素值赋值给max和min
		for(int i=1;i<number.length;i++) {
			if(number[i]>max) { //依次判断后面元素值是否比max大
				max = number[i];//如果大，则修改max值
			}
			if(number[i]<min) { //依次判断后面元素值是否比min小
				min = number[i]; //如果小，则修改min值
			}
		}
		//输出最大值和最小值
		System.out.println("最大值："+max);
		System.out.println("最小值："+min);

	}

}
