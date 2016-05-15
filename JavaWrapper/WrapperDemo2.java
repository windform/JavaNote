package JavaWrapper;

/*
 * 包装类的应用
 * 包装类在实际中用得最多的还是将字符串变为基本数据类型的操作
 * */
public class WrapperDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//字符串变为基本数据类型
		String str1="30";
		String str2="30.3";
		int x=Integer.parseInt(str1);
		float y=Float.parseFloat(str2);
		System.out.println("整数乘方：x*x="+ (x*x));
		System.out.println("小数乘方：y*y="+ (y*y));
	}

}
