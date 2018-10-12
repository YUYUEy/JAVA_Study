/*
   ArrayList 集合中的方法
   
   add(参数) 向集合中添加元素,数据存储进去
   方法中的参数类型,定义集合对象时候的类型是一致
   
   ArrayList<Integer> array = new ArrayList<Integer>();
   array.add(3);
   
   get(int index) 取出集合中的元素,get方法的参数,写入索引
   
   size() 返回集合的长度, 集合存储元素的个数
*/
   /*
   集合ArrayList方法的补充
   
     add(int 索引,存储的元素) 将元素添加到指定的索引上
	 set(int 索引,修改后的元素) 将指定索引的元素,进行修改
	 remove(int 索引) 删除指定索引上的元素
	 clear() 清空集合中的所有元素
*/
import java.util.ArrayList

public class ArrayListDemo_1{
	public static void main(String[] args) {
		//定义集合,存储字符串元素
		ArrayList<String> array = new ArrayList<String>();
		//调用集合方法add存储元素
		array.add("abc");
		array.add("itcast");
	    array.add("love");
		array.add("java");
		//输出集合的长度,调用集合方法size, size方法的返回值类型 int
		int size = array.size();
		System.out.println(size);
		//获取出集合中的一个元素,获取1索引的元素
		//集合的方法get, 获取元素后结果数据类型
		String s = array.get(1);
		
		//对集合进行遍历
		//使用方法 size+get组合进行遍历
		for(int i=0; i<array.size(); i++){
			System.out.println(array.get(i));
		}
		// 新建一个整型
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		array2.add(11);
		array2.add(13);
		array2.add(24);
		array2.add(42);

		//在索引2上,添加元素7
		array2.add(2,7);

		//将0索引上的元素,修改成10
		array2.set(0,10);

		//将4索引上的元素,删除
		array2.remove(4)

		array2.clear();
	}
}