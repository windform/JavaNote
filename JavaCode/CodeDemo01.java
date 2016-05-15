package JavaCode;

class Demo1{
	{
		System.out.println("1、构造块");
	}
	static{
		System.out.println("0、静态代码块");
	}
	public Demo1(){
		System.out.println("2、构造方法");
	}
}
public class CodeDemo01 {
	static{
		System.out.println("在主方法类中定义的代码块");
	}
	public static void main(String args[]){
		new Demo1();
		new Demo1();
		new Demo1();
	}

}
