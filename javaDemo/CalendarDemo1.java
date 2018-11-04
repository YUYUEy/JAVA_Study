import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1{
	public static void main(String[] args) {
		function_3();
	}
	/*
	 * Calendar类的方法getTime()
	 * 把日历对象,转成Date日期对象
	 */
	public static void function_3(){
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		System.out.println(date);
	}

	/*
	 * Calendar类方法add 日历的偏移量,
	 * 可以指定一个日历中的字段,
	 * 进行整数的偏移 add(int field, int value)
	 */
	public static void function_2(){
		Calendar c = Calendar.getInstance();
		// 让日历中的天数,向后偏移280天
		c.add(Calendar.DAY_OF_MONTH, -280);
		// 获取年份
		int year = c.get(Calendar.YEAR);
		// 获取月份
		int month = c.get(Calendar.MONTH) + 1;
		// 获取天数
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "年" + month + "月" + day + "日");
	}
	/*
	 * Calendar类的set方法 设置日历 set(int field,int value) field 设置的是哪个日历字段 value
	 * 设置后的具体数值
	 * 
	 * set(int year,int month,int day) 传递3个整数的年,月,日
	 */
	public static void function_1(){
		Calendar c =Calendar.getInstance();
		// 设置年,月,日
		c.set(2099, 4, 1);
		/////
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "年" + month + "月" + day + "日");
	}
}
