package learnstudy;
import java.util.Scanner;
public class IfDemo2 {

	public static void main(String[] args) {
		// If-else语句用于对多个条件进行判断；
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个星期数（1-7）：");
		int week = sc.nextInt();
		if(week == 1 ) {
			System.out.println("星期一");
			
		}else if(week == 2 ) {
			System.out.println("星期二");
			
		}
		else if(week == 3 ) {
			System.out.println("星期三");
			
		}else if(week == 4 ) {
			System.out.println("星期四");
			
		}else if(week == 5 ) {
			System.out.println("星期五");
			
		}else if(week == 6 ) {
			System.out.println("星期六");
			
		}else if(week == 7 ) {
			System.out.println("星期天");
			
		}

	}

}
