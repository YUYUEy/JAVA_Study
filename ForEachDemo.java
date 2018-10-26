package cn.itcast.demo2;
import java.util.ArrayList;

/*
 *  JDK1.5新特性,增强for循环
 *  JDK1.5版本后,出现新的接口 java.lang.Iterable
 *    Collection开是继承Iterable
 *    Iterable作用,实现增强for循环
 *    
 *    格式:
 *      for( 数据类型  变量名 : 数组或者集合 ){
 *         sop(变量);
 *      }
 */
import cn.itcast.demo.Person;
public class ForEachDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(11);
		arr1.add(222);
		arr1.add(3);
		arr1.add(4444);
		for (int i :arr1 ) {
			System.out.println(i);
		}
		///
		String[] str = {"abc","itcast","cn"};
		for (String s:str ) {
			System.out.println(s.length());
		}
	}
	public static void function_1(){
		int[] arr2 ={12,44,6,76};
		for (int i :arr2 ) {
			System.out.println(i);
		}
	}
	//////////////////////////////
	int week = 5;
	switch (week) {
	case 1:
		System.out.println("星期一");
		break;
	case 2:
		System.out.println("星期二");
		break;
	case 3:
		System.out.println("星期三");
		break;
	case 4:
		System.out.println("星期四");
		break;
	case 5:
		System.out.println("星期五");
		break;
	case 6:
		System.out.println("星期六");
		break;
	case 7:
		System.out.println("星期天");
		break;
	default:
		System.out.println("输入的数字不正确...");
		break;
	}
	////////////////////////打印出数组----
	
		int[] arr1 ={1,35,6,78,98};
		String[] arr2 ={"sad","sds","were"};
		System.out.println(Arrays.asList(arr2));
		System.out.println(Arrays.asList(arr1));
	
	/////////////////////////控制台输入
	 Scanner sc = new Scanner(System.in);
		 while (true) {
			 if(sc.hasNext()){
				 System.out.println(sc.next());
			 }
		}
}
