package learnstudy;
/*
 * for循环语句：for（初始化语句;条件判断语句;条件控制语句）{
 *                  循环体语句;
 * }
 * 
 */

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*输出54次hellowrold
		 * for(int i=2;i<=5;i++) {
			System.out.println("HelloWorld");
		}
		 */
		/*
		//输出数据案例：在控制台输出1-5
		for(int i =1;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println("\n");
		//输出5-1数据
		for(int i =5;i>=1;i--) {
			System.out.println(i);
		}
		*/
		//求和案例：求1到99之间的数据和
		        int sum=0;
		       
				for(int i=1;i<=99;i++) {
					sum +=i;//累加操作： sum+i=sum
					
				}
				System.out.println("1-99的和："+ sum);
				
				
				//求偶数和案例：1-100的偶数和
		        /*
	
				for(int i=1;i<=100;i++) {
					if((i%2) == 0) {//限制条件：判断是否为偶数
						sum += i;
					}
					
				}
				System.out.println("1-100的偶数和:"+sum);
				*/
	}

}
