package learnstudy;
/*
 * Switch语句输出格式
 * switch（表达式）{
       case 常量值1：
            语句块1
             break;
       case 常量值2：
            语句块2
             break;
             dafault：
             默认语句块
 * }
 */
import java.util.Scanner;
public class Switch {



	private static final int A = 1;
	private static final int B = 2;
	private static final int C = 3;
	private static final int D = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字：");
		int X = sc.nextInt();
		//输入1-4数字 输出类型
		switch(X) {
		case A:
			System.out.println("优秀");
			break;
		case B:
			System.out.println("良好");
			break;
		case C:
			System.out.println("合格");
			break;
		case D :
			System.out.println("不合格");
			break;
			default:
				System.out.println("输入的数字错误：不在1-4范围内");
		}

	}

}
