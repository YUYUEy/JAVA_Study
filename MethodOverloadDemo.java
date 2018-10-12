/*
    方法的重载特性 (overload)
	在同一个类中,允许出现同名的方法,只要方法的参数列表不同即可,这样方法就是重载
	参数列表不同: 参数的个数,数据类型,顺序
*/
public class MethodOverloadDemo{
	//对于重载的调用,根据参数传递进行区分
	public static void main(String[] args) {
		// System.out.println();
		int sum1 = getSum(3,5);
		double sum2 = getSum(2.2, 4,3);
		System.out.println(sum1);
		System.out.println(sum2);
	}
	public static void getSum(int a,int b){
		System.out.println("两个int参数");
		return a+b;
	}
	public static void getSum(double a,double b){
		System.out.println("两个double参数");
		return a+b;
	}
	public static void getSum(int a,int b, int c){
		System.out.println("三个int参数");
		return a+b +c;
	}
}