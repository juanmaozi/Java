package ArrayList;

import java.util.ArrayList;

/*
ArrayList构造方法：
  public ArrayList()：创建一个空的集合对象
  ArrayList添加方法：
  public boolean add(E e):将指定元素追加到此集合的末尾
  public void add(int index,E element):在此集合中的指定位置插入指定元素
ArrayList常用方法：
public boolean remove(Object o):删除指定的元素，返回删除是否成功
public E remove(int index): 删除指定索引处的元素，返回被删除的元素
public E set(int index,E element):修改指定索引处的元素，返回被修改的元素
public E get(int index):返回指定索引处的元素
public int size():返回集合中的元素个数

 */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        //  public boolean add(E e):将指定元素追加到此集合的末尾
        arr.add("s");
        arr.add("b");
        arr.add("c");
        //public void add(int index,E element):在此集合中的指定位置插入指定元素
//       arr.add(1,"e"); //在1索引处添加e元素
//        错误示范：索引越界
//        arr.add(4,"java");
        //public boolean remove(Object o):删除指定的元素，返回删除是否成功
//        System.out.println(arr.remove("b"));
//        System.out.println(arr.remove("ab"));
        //public E remove(int index): 删除指定索引处的元素，返回被删除的元素
//        System.out.println(arr.remove(1));
        //IndexOutOfBoundsException索引越界
//        System.out.println(arr.remove(3));
        //public E set(int index,E element):修改指定索引处的元素，返回被修改的元素
//        System.out.println(arr.set(1,"java"));
        //public E get(int index):返回指定索引处的元素
        System.out.println(arr.get(1));
        //public int size():返回集合中的元素个数
        System.out.println(arr.size());

        //输出集合
        System.out.println("Array:"+arr);

    }
}
