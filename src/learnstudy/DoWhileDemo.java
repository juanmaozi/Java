package learnstudy;
/*
 * do...while循环语句
       初始化语句;
        do{
           循环体语句;
           条件控制语句;
        }while(条件判断语句);
 */

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//求1-99的和
		int sum =0;
		int i = 1;
		do {
			sum +=i;
			i++;
		}while(i<=99);
		System.out.println("1-99的和："+sum);

	}

}
