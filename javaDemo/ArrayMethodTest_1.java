/*
   数组的逆序:
     数组中的元素,进行位置上的交换
	 逆序 不等于 反向遍历
	 就是数组中最远的两个索引,进行位置交换,实现数组的逆序
	 使用的是数组的指针思想,就是变量,思想,可以随时变换索引
	 反转 reverse
	 实现步骤:
	   1. 定义方法,实现数组的逆序
	   2. 遍历数组
	     实现数组的最远索引换位置
		 使用临时的第三方变量
*/
public class ArrayMethodTest_1{
	public static void main(String[] args) {
	
		int[] array = {3,5,7,1,0,9,-2};
		//调用数组的逆序方法
		reverse(array);
		//看到数组的元素,遍历
		printArray(array);
	}
	public static void reverse(int[] array){
		for(int min=0, max =array.size(); min <max; min++,max--){
			int tmp =array[min];
			array[min] =array[max];
			array[max] =tmp;
		}
	}
	public static void printArray(int[] array){
		for(int i=0; i<array.size(); i++){
			System.out.print(array[i]+",");
		}
	}
}
