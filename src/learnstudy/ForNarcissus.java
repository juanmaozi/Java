package learnstudy;
/*
 * 案例：在控制台输出所以的水仙花数
 * 什么是水仙花数：1.三位数 111 123 333
 * 2.水仙花的个位十位百位数字立方和等于原数 3³+7³+1³=371
 */

public class ForNarcissus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*三位数的个位如何求：371%10=1 对10取余数
		 *三位数的百位如何求  371/100=3 除于100
		 *三位数的十位如何求 371/ 10 % 10=7 先除10再对10进行取余
		 *思考：任意数字的指定位上的数值如何求
		 *先使用整除操作将要求的数字移动到个位上，再进行取余操作得出最后一位上的值
		 */
		
		for(int i=100;i<1000;i++) {
			int a =i/100;//求百位
			int b =i/ 10 % 10;//求十位
			int c =i% 10 ;//求个位
			if(a*a*a + b*b*b + c*c*c == i){
				System.out.println("水仙花数为："+ i);
				
			}
		}

	}

}
