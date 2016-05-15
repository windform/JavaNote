package JavaThrows;
/*Throws 关键字
 * 在定义一个方法时可以使用throws关键字声明，使用shrows声明的方法表示此方法不处理异常，而交给方法的调用进行处理
 * 语法：public 返回值类型 方法名称（参数列表）throws 异常类{}
 * */

//在主方法处使用throws关键字
class Math1{
	public int div(int j,int i) throws Exception{   //方法可以不处理异常
		int temp=j/i;		//此处有可能产生异常
		return temp;		//返回计算结果
	}
}

public class ThrowsDemo2 {
	//本方法处的所有异常都可以不使用try..catch处理，在实际操作中不建议在主方法中使用throws关键字
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Math1 m=new Math1();
		System.out.println("除法操作："+m.div(10, 2));

	}

}
