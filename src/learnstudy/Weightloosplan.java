package learnstudy;
/*
 * 案例：减肥计划
 * 需求：输入星期数，显示今天的运动
 * if语句实现
 */
import java.util.Scanner;
public class Weightloosplan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一个星期数（1-7）：");
		int day = sc.nextInt();
		if(day<1 || day>7) {
			System.out.println("您输入的星期有误");
		}else if(day==1) {
			System.out.println("跑步");
		}else if(day==2) {
			System.out.println("游泳");
		}else if(day==3) {
			System.out.println("慢走");
		}else if(day==4) {
			System.out.println("动感单车");
		}else if(day==5) {
			System.out.println("拳击");
		}else if(day==6) {
			System.out.println("爬山");
		}else if(day==7) {
			System.out.println("好好吃一顿");
			

		}
		

	}

}
