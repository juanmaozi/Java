package learnstudy;
/*
 * 数组遍历
 *获取数组长度的格式：数组名.length
 */
public class ArrayTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {2,4,6,8,10}; //定义数组
		//通过for循环实现获取数据，索引0-4
		for(int i= 0 ;i<a.length;i++) { //遍历数组元素
			System.out.println(a[i]); //索引访问数组
		}

	}

}
