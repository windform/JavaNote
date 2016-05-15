package JavaInterface;
/*继承抽象类实现接口
 * 语法：class 子类 extends 抽象类 implements 接口A,接口B
 * */


//定义接口A2
interface A2{
	public String AUTHOR="廖东";   //等价于public static final String 
	public void print();   //定义抽象方法，等价于 public abstract void
	public String getInfo();
}

//定义抽象类B2
abstract class B2{
	public abstract void say();
}
class X2 extends B2 implements A2{
	public void say(){  //覆写B2接口中的抽象方法
		System.out.println("Hello World");
	}
	public String getInfo(){  //覆写A2接口的getInfo()方法
		return "HELLO";
	}
	public void print(){   //覆写A2接口的print()方法
		System.out.println("作者："+AUTHOR);
	}
}

public class InterfaceDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X2 x= new X2();
		System.out.println(x.getInfo());
		x.say();
		x.print();

	}

}
