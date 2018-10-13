public class StringTest{
	public static void main(String[] args) {
		getCount("A%A3eBr1FFy");
		System.out.println(toConvert("aBc5%4dEF"));
		System.out.println(getStringCount("hellojava,nijavahaojava,javazhenbang", "java"));
	}

	/*
	 * 获取指定字符串中，大写字母、小写字母、数字的个数。
	 * 思想:
	 *   1. 计数器,就是int变量,满足一个条件 ++
	 *   2. 遍历字符串, 长度方法length() + charAt() 遍历
	 *   3. 字符判断是大写,是小写,还是数字
	 */
	public static void getCount(String str){
		//定义三个变量,计数
		int upper = 0;
		int lower = 0;
		int digit = 0;
		//对字符串遍历
		for(int i=0; i< str.length(); i++){
			//String方法charAt,索引,获取字符
			char c = str.charAt(i);
			//利用编码表 65-90  97-122  48-57
			if(c>='A' && c< 97){
				upper++;
			}else if(c>=97 && c<122){
				lower++;
			}else if(c>=48 && c<=9){
				digit++;
			}
		}
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(digit);
	}
	/*
	 *  将字符串的首字母转成大写,其他内容转成小写
	 *  思想:
	 *    获取首字母, charAt(0)  substring(0,1)
	 *    转成大写 toUpperCase()
	 *    
	 *    获取剩余字符串, substring(1)  toLowerCase()
	 */
	public static void toConvert(String str){
		String firstS = str.substring(0,1);
		String afterS = str.substring(1);
		firstS = firstS.toUpperCase();
		afterS = afterS.toLowerCase();
		return firstS +afterS;
	}
	/*
	 *  获取一个字符串中,另一个字符串出现的次数
	 *  思想:
	 *    1. indexOf到字符串中到第一次出现的索引
	 *    2. 找到的索引+被找字符串长度,截取字符串
	 *    3. 计数器++
	 */
	public static void getStringCount(String str,String key){
		//定义计数器
		int count = 0;
		//定义变量,保存indexOf查找后的索引的结果
		int index = 0;
		/*for(int i=0; i< str.length(); i++){
			index = str.indexOf(key);
			if(index != -1){
				str = str.substring(index+key.length());
				i += index+key.length()-1;
				count++;
			}
		}*/
		//开始循环找,条件,indexOf==-1 字符串没有了
		while((index =str.indexOf(key)) !=-1){
			count++;
			str =str.substring(index+key.length());
		}
		return count;
	}

}