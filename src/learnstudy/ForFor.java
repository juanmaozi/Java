package learnstudy;
/*
 * 循环嵌套：循环语句中包含循环语句
 * 案例：输出一天的小时和分钟；
 */
public class ForFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//外循环控制小时范围，内循环控制分钟范围
		for(int hour=0;hour<24;hour++) {
			for(int minute=0;minute<60;minute++) {
				System.out.println(hour+"小时"+minute+"分钟");
			}System.out.println("-------");
		}
		

	}

}
