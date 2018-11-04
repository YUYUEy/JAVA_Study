/*
    定义类:
	  使用类的形式,对现实中的事物进行描述
	  事物: 方法,属性
	    方法: 这个事物具备的功能
		属性: 变量

     格式:
	   public class 类名{
		    属性定义
			  修饰符 数据类型 变量名 = 值
			
			方法定义
			  修饰符 返回值类型  方法名(参数列表){
				  
			  }
	   }
	   
	   要求: 使用Java中的类,描述生活中的手机这个事物
	     手机事物,具备哪些属性, 属于他自己的特性
		   颜色,品牌, 大小
*/

public class Phone{
	public static void main(String[] args) {
	
		//创建汽车引用类型
		Car c = new Car();
		c.brand = "巨力";
		c.type = "拖拉机";
		c.paiLiang = 0.5;
		
		System.out.println(c.brand+"  "+c.type+"  "+c.paiLiang);

		//创建学生引用类型
		Student stu = new Student();
		stu.name = "张三";
		stu.age = 20;
		stu.sex = '男';
		System.out.println(stu.name+"  "+stu.age+"  "+stu.sex);
	}
}
