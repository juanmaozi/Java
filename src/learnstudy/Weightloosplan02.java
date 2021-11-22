package learnstudy;
/*
 * 案例：减肥计划
 * 需求：输入星期数，显示今天的运动
 * switch语句实现
 */
import java.util.Scanner;

public class Weightloosplan02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个星期数（1-7）：");
		int day = sc.nextInt();
		switch(day) {
		case 1:
			System.out.println("跑步");
			break;
		case 2:
			System.out.println("睡觉");
			break;
		case 3:
			System.out.println("做饭");
			break;
		case 4:
			System.out.println("想你");
			break;
		case 5:
			System.out.println("打游戏");
			break;
		case 6:
			System.out.println("吃屎");
			break;
		case 7:
			System.out.println("白日梦");
			break;
			default:
				System.out.println("输入的数字不在范围内");
		}

	}

}
