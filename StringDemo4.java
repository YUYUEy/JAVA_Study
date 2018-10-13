public class StringDemo4{
	public static void main(String[] args) {
		ifEqual();
	}

	/*
	 *  boolean equals(Object obj)
	 *  方法传递字符串,判断字符串中的字符是否完全相同,如果完全相同返回true
	 *  
	 *  boolean equalsIgnoreCase(String s)
	 *  传递字符串,判断字符串中的字符是否相同,忽略大小写
	 */
	public static void ifEqual(){
		String s1 ='ABC';
		String s2 ='abc';
		boolean b1 = s1.equals(s2);
		boolean b2 = s1.equalsIgnoreCase(s2);
		System.out.println(b1);
		System.out.println(b2);
	}

	/*
	 * char[] toCharArray() 将字符串转成字符数组
	 * 功能和构造方法相反
	 */
	public static void function_01(){
		String str = "itcast";
		//调用String类的方法toCharArray()
		char[] ch =str.toCharArray();
		for(int i=0; i< ch.length; i++){
			System.out.println(ch[i]);
		}
	}

	/*
	 *  byte[] getBytes() 将字符串转成字节数组
	 *  此功能和String构造方法相反
	 *  byte数组相关的功能,查询编码表
	 */
	public static void function_02(){
		String str = "abc";
		//调用String类方法getBytes字符串转成字节数组
		Byte[] ch = str.getBytes();
		for(int j=0; j< ch.length; j++){
			System.out.println(ch[j]);
		}
	}

	
	public static void ifContain(){
		/*
		 *  boolean contains (String s)
		 *  判断一个字符串中,是否包含另一个字符串
		 */
		String str="itcast.cn";
		String s1 ="ca";
		boolean b1 = str.contains(s1);
		System.out.println(b1);

		/*
	 * boolean startsWith(String prefix)  
	 * 判断一个字符串是不是另一个字符串的前缀,开头
	 * howareyou
	 * hOw
	 */
		boolean b2 = str.startsWith(s1);
		/*
	 * boolean endsWith(String prefix)
	 * 判断一个字符串是不是另一个字符串的后缀,结尾
	 * Demo.java
	 *     .java
	 */
		boolean b3 = str.endsWith(s1);
	}
}