package learnstudy;
/*If else语句
 * 例子：考试奖励
 * 根据不同得分，小明获得的奖励不同；
 * 测试数据：正确数据，边界数据，错误数据
 */
import java.util.Scanner;
public class ExamReward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("开始");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入小明的成绩：");
		int score = sc.nextInt();
		//if-else语句判断
		if(score>100 || score<0) {
			System.out.println("输入的成绩有误");
		}else if(score >= 100) {
			System.out.println("小明可以获得100元");
		}else if(score >= 90) {
			System.out.println("小明可以获得90元");
		}else if(score >= 80) {
			System.out.println("小明可以获得80元");
		}else if(score >= 70) {
			System.out.println("小明可以获得70元");
		}else if(score >= 60) {
			System.out.println("小明可以获得60元");
		}else {
			System.out.println("小明可以获得一顿挨骂");
		}
		System.out.println("结束");
	}

}
