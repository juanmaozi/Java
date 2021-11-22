package learnstudy;
/*
 * 案例：拼接字符串
 * 需求：定义一个方法，把int数组中的数据按照指定格式拼接成一个字符串返回，调用该方法，并在控制台输出结果
 */
public class StringTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3};
		String s = arrayToString(arr);
		System.out.println("s:"+s);

		
		
		
	

	}
	public static String arrayToString(int [] arr) {
			String s ="" ;
			s +="[";
			//遍历数组
			for(int i =0;i<arr.length;i++) {
				if(i==arr.length-1) {
					s += arr[i];
				}else {
					s+=arr[i];
					s+=",";

				}
			}
			s +="]";
			
			return s;
			
		}}

