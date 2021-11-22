package learnstudy;
/*
 * 案例：统计字符次数
 * 需求：键盘录入一个字符串，统计该字符串大写字母字符，小写字母字符，数字字符出现的次数（不考虑其他字符）
   	判断该字符属于大写字母，小写字母，还是数字
   	大写字母：ch>='A' && ch<='Z'
   	小写字母：ch>='a' && ch<='z'
   	数字： ch>='0' && ch<='9'
 
 
 */
import java.util.Scanner;
public class StringTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String a = sc.nextLine();
		int bigCount = 0;
		int smallCount = 0;
		int numberCount= 0;
		for(int i=0;i<a.length();i++) {
			char ch = a.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				bigCount++;
			}else if(ch>='a' && ch<='z') {
				smallCount++;
			}else if(ch>='0' && ch<='9') {
				numberCount++;
			}
		}
		System.out.println("大写字母："+bigCount+"个");
		System.out.println("小写字母："+smallCount+"个");
		System.out.println("数字："+numberCount+"个");

	}

}
