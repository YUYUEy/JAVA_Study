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
}
