package cn.itcast.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *  集合中的迭代器:
 *    获取集合中元素方式
 *  接口 Iterator : 两个抽象方法
 *     boolean hasNext() 判断集合中还有没有可以被取出的元素,如果有返回true
 *     next() 取出集合中的下一个元素
 *     
 *  Iterator接口,找实现类.
 *    Collection接口定义方法 
 *       Iterator  iterator()
 *    ArrayList 重写方法 iterator(),返回了Iterator接口的实现类的对象
 *    使用ArrayList集合的对象
 *     Iterator it = array.iterator(),运行结果就是Iterator接口的实现类的对象
 *     it是接口的实现类对象,调用方法 hasNext 和 next 集合元素迭代
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add('abc1');
		coll.add('abc2');
		coll.add('abc3');
		coll.add('abc4');
		//迭代器,对集合ArrayList中的元素进行取出
		
		//调用集合的方法iterator()获取出,Iterator接口的实现类的对象
		Iterator<String> it = coll.iterator();
		//接口实现类对象,调用方法hasNext()判断集合中是否有元素
		//boolean b = it.hasNext();
		//System.out.println(b);
		//接口的实现类对象,调用方法next()取出集合中的元素
		//String s = it.next();
		//System.out.println(s);
		
		//迭代是反复内容,使用循环实现,循环的条件,集合中没元素, hasNext()返回了false
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}

		/*  Collection接口方法
		 *  Object[] toArray() 集合中的元素,转成一个数组中的元素, 集合转成数组
		 *  返回是一个存储对象的数组, 数组存储的数据类型是Object
		 */
		Object objs = coll.toArray();
		for(int i=0; i<objs.length; i++){
			System.out.println(objs[i]);
		}

		/*
		 * 学习Java中三种长度表现形式
		 *   数组.length 属性  返回值 int
		 *   字符串.length() 方法,返回值int
		 *   集合.size()方法, 返回值int
		 */
		
		/*
		 * Collection接口方法
		 * boolean contains(Object o) 判断对象是否存在于集合中,对象存在返回true
		 * 方法参数是Object类型
		 */
		boolean b1 = coll.contains('abc2');		//true

		/*
		 * Collection接口的方法
		 * void clear() 清空集合中的所有元素
		 * 集合容器本身依然存在
		 */
		coll.clear();
	}
}
