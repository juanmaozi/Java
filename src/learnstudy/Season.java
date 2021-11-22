package learnstudy;
/*
 * Switch案例：春夏秋冬 case具有穿透性
 * 一年有十二个月，分属于春夏秋冬，键盘输入一个月份，判断是哪个季节并输出	
 */
import java.util.Scanner;
public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入月份（1-12）：");
		Scanner sc = new Scanner(System.in);
		int month =  sc.nextInt();
		/*
		  switch(month) {
		 
		case 1 :
			System.out.println(month+"月份为冬天");
			break;
		case 2 :
			System.out.println(month+"月份为春天");
			break;
		case 3 :
			System.out.println(month+"月份为春天");
			break;
		case 4 :
			System.out.println(month+"月份为春天");
			break;
		case 5 :
			System.out.println(month+"月份为夏天");
			break;
		case 6 :
			System.out.println(month+"月份为夏天");
			break;
		case 7 :
			System.out.println(month+"月份为夏天");
			break;
		case 8 :
			System.out.println(month+"月份为秋天");
			break;
		case 9 :
			System.out.println(month+"月份为秋天");
			break;
		case 10 :
			System.out.println(month+"月份为秋天");
			break;
		case 11 :
			System.out.println(month+"月份为冬天");
			break;
		case 12 :
			System.out.println(month+"月份为冬天");
			break;
			default:
				System.out.println("你输入的月份有误");
		}
		*/
		//case具有穿透性
		//以下为简洁代码：
		switch(month) {
		case 1 :
		case 11 :
		case 12 :
			System.out.println(month+"月份为冬天");
			break;
		case 2 :
		case 3 :
		case 4 :
			System.out.println(month+"月份为春天");
			break;
		case 5 :
		case 6 :
		case 7 :
			System.out.println(month+"月份为春天");
			break;
		case 8 :
		case 9 :
		case 10 :
			System.out.println(month+"月份为春天");
			break;
		
			default:
				System.out.println("你输入的月份有误");
		}
	}

}
