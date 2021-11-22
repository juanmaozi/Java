package StringBuilder;
/*
案例：拼接字符串
需求:定义一个方法，把int数组中的数据按照指定格式拼接成一个字符串返回，调用该方法，并在控制台输出结果
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        //定义数组
        int [] arr={1,2,3};
        //调用方法
        String s =arrayToString(arr);
        //输出结果
        System.out.println("s:"+s);

        }
    //定义方法
    public static String arrayToString(int [] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i =0;i< arr.length;i++){
            if(i == arr.length -1){//如果相等，这是最后一个元素
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        //StringBuilder转换为String
        String s = sb.toString();
        return s;

    }
}