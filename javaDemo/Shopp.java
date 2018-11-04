public class Shopp{
	public static void main(String[] args) {
		String[] brand = {"MacBookAir","ThinkpadT450"};
		double[] size = {13.3,15.6};
		double[] price = {9998.97,6789.56};
		int [] count={0, 0};

		int choose = chooseType();

		switch(choose){
			case 1:
				//调用查看库存清单方法
			  	printStore(brand,size,price,count);
			break;
			case 2:
			  //调用修改库存的方法
			  update(brand,count);
			break;
			
			case 3:
				return;

			default:
				 System.out.println("没有这个功能");
			break;
		}

	}
	// 
	public static void printStore(String[] brand, double[]size, double[]price, int[]count){
		System.out.println("----------商场库存清单----------");
		System.out.println("品牌型号     尺寸    价格    库存数");
		//定义变量,计算总库存数,和总价格
		int totalCount = 0;
		int totalMoney = 0;
		for(int i=0; i<brand.length; i++){
			System.out.println("品牌型号"+brand[i]+",尺寸"+ size[i] + ",价格"+ price[i] +",库存数"+count[i]);
			totalCount += count[i];
			totalMoney += count[i] * price[i];
		}
		System.out.println("总库存数: "+totalCount);
		System.out.println("商品库存总金额: "+totalMoney);
	}
	// 
	public static void update(String[]brand, int[]count){
		//遍历数组,遍历到一个,修改一个
		//接受键盘输入
		Scanner sc = new Scanner(System.in);
		//遍历数组
		for(int i = 0; i < brand.length ; i++){
			System.out.println("请输入"+brand[i]+"的库存数");
			//键盘输入,录入库存, 存储到库存的数组中
			int newCount = sc.nextInt();
			count[i] = newCount;
		}
		//int chooseNumber = sc.nextInt();
	}
	// 
	public static int chooseType(){
		System.out.println("-------------库存管理------------");
		System.out.println("1.查看库存清单");
		System.out.println("2.修改商品库存数量");
		System.out.println("3.退出");
		System.out.println("请输入要执行的操作序号：");

		//接受键盘输入
		Scanner sc = new Scanner(System.in);
		int chooseNumber = sc.nextInt();
		return chooseNumber;
	}
}
