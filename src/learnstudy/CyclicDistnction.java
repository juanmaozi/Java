package learnstudy;
//循环区别
public class CyclicDistnction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//for循环
        int sum=0;
	       
		for(int i=1;i<=99;i++) {
			sum +=i;//累加操作： sum+i=sum
			
		}
		System.out.println("1-99的和："+ sum);
		
		//while循环
		int sum2=0;
		int j =1 ;
		while(j<=99) {
			sum2 +=j;
			j++;
			
		}
		System.out.println("1-99和为："+ sum2);
		//do-while循环
		int sum1 =0;
		int k = 1;
		do {
			sum1 +=k;
			k++;
		}while(k<=99);
		System.out.println("1-99的和："+sum1);
		*/
		
		
		 //死循环
		//for
		/*
		for(;;) {
			System.out.println("for");
		}
		*/
		//while
		/*
		while(true) {
			System.out.println("while");
		}
		*/
		//do-while
		do {
			System.out.println("do-true");
		}while(true);
		
		 

	}

}
