public static StringBufferDemo{
	public static void main(String[] args) {
		function_1()
	}
	public static void function_1(){
		StringBuffer buffer = new StringBuffer();

		// StringBuffer append, 将任意类型的数据,添加缓冲区
		buffer.append('abcdefg');
		buffer.append(1234);
		//将可变的字符串缓冲区对象,变成了不可变String对象
		String s = buffer.toString();
		System.out.println(s);
		// ----------------------
		//reverse() 将缓冲区中的字符反转
		buffer.reverse();

		// -----------------------------
		// replace(int start,int end, String str)
	 // *    将指定的索引范围内的所有字符,替换成新的字符串
		buffer.replace(1,4,'Q');

		// --------------------------------
		// insert(int index, 任意类型)
	 // *  将任意类型数据,插入到缓冲区的指定索引上
		buffer.insert(3,9.5);

		// ----------------------------
		// delete(int start,int end) 删除缓冲区中字符
	 // *   开始索引包含,结尾索引不包含
		buffer.delete(3,5);
	}
}