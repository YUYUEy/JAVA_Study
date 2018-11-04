package cn.itcast.demo1;
/*
 *   JDK1.5后出现的特性,自动装箱和自动拆箱
 *   自动装箱: 基本数据类型,直接变成对象
 *   自动拆箱: 对象中的数据变回基本数据类型
 */
public class IntegerDemo2{
	public static void main(String[] args) {
		function_1();
		function_2();
		function_3();
		function_4();
	}
	/*
	 *  关于自动装箱和拆箱一些题目
	 */
	public static void function_2(){
		Integer i =new Integer(1);
		Integer j =new Integer(1);
		System.out.println(i==j);// false 对象地址
		System.out.println(i.equals(j));// true  继承Object重写equals,比较的对象数据

		Integer a=500;
		Integer b=500;
		System.out.println(a==b);//false
		System.out.println(a.equals(b));//true

		//数据在byte范围内,JVM不会从新new对象
		Integer aa = 127; // Integer aa = new Integer(127)
		Integer bb = 127; // Integer bb = aa;
		System.out.println(aa==bb); //true
		System.out.println(aa.equals(bb));//true
	}
	/*
	 * Integer类的3个静态方法
	 * 做进制的转换
	 * 十进制转成二进制  toBinarString(int)
	 * 十进制转成八进制  toOctalString(int)
	 * 十进制转成十六进制  toHexString(int)
	 * 三个方法,返回值都是以String形式出现
	 */
	public static void function_1(){
		System.out.println(Integer.toBinarString(99));
		System.out.println(Integer.toOctalString(99));
		System.out.println(Integer.toHexString(999));
		/*
		 *   Integer类的静态成员变量
		 *   MAX_VALUE
		 *   MIN_VALUE
		 */
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
	/*
	 * Integer类,封装基本数据类型int,提高大量方法
	 * 将字符串转成基本数据类型int
	 * 
	 * 
	 * Integer i = Integer.valueOf("1");
	 * i.intValue()
	 */
	/*
	 *  Integer类构造方法
	 *   Integer (String s)
	 *   将数字格式的字符串,传递到Integer类的构造方法中
	 *   创建Integer对象,包装的是一个字符串
	 *   将构造方法中的字符串,转成基本数据类型,调用方法,非静态的, intValue()
	 */
	public static void function_3(){
		Integer in = new Integer('111');
		int i = in.intValue();
		System.out.println(i++);
	}
	/*
	 *  如何将基本类型int,变成字符串
	 *  
	 *  int => String  任何类型+"" 变成String类型
	 *  Integer类中的静态方法toString()
	 *  
	 *  toString(int ,int 进制), 将int整数,转成指定进制数
	 *  0-9A-Z
	 */
	public static void function_4(){
		int i = 3;
		String s = i+"";
		System.out.println(s+1);

		String s1 = Integer.toString(5, 2);

	}
	/*
	 * Integer类静态方法parseInt(String s, int radix)
	 * radix基数,进制
	 * "110",2 含义 前面的数字是二进制的,但是方法parseInt运行结果都是十进制
	 */
	public static void function_5(){
		int i = Integer.parseInt("110", 2);
		System.out.println(i);
	}
	/*
	 * Integer类中静态方法 parseInt(String s) 返回基本数据类型
	 * 要求: 字符串必须是数字格式的
	 */
	public static void function_6(){
		int i = Integer.parseInt("12");
		System.out.println(i/2);
	}

}
