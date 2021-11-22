package learnstudy;
/*
 * while循环跟for循环等价
 * While循环语句格式
 * 初始化语句
 * while(条件判断语句){
       循环体语句；
       条件控制语句
 * }
 */

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输出1到5数字
		/*
		int i =1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		*/
		
		//求1-99的和
		int sum=0;
		int j =1 ;
		while(j<=99) {
			sum +=j;
			j++;
			
		}
		System.out.println("和为："+ sum);

	}

}
