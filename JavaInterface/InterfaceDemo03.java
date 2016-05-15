package JavaInterface;

//抽象类实现接口

//定义接口A3
interface A3{
	public String AUTHOR="廖东";   //等价于public static final String 
	public void print();   //定义抽象方法，等价于 public abstract void
	public String getInfo();
}

//定义抽象类B3,实现接口
abstract class B3 implements A3{
	public abstract void say();
}
class X3 extends B3{
	public void say(){  //覆写抽象类B3的抽象方法
		System.out.println("Hello World");
	}
	public String getInfo(){  //覆写抽象类B3的getInfo()方法
		return "HELLO";
	}
	public void print(){   //覆写抽象类B3的print()方法
		System.out.println("作者："+AUTHOR);
	}
}
public class InterfaceDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X3 x = new X3();
		x.say();
		x.print();
	}
}
