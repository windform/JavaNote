package JavaInterface;

/*接口的继承
 * 1、语法：interface 子接口 extends 父接口A,父接口B
 * */

//定义接口A4
interface A4{
	public String AUTHOR="蓝白";
	public void printA();
}
//定义接口B4
interface B4{
	public void printB();
}
//定义接口C4，同时继承接口A4、B4
interface C4 extends A4,B4{
	public void printC();
}

class X4 implements C4{
	public void printA(){  
		System.out.println("A3-Hello World");
	}
	public void printB(){  
		System.out.println("B3-Hello World");
	}
	public void printC(){  
		System.out.println("C3-Hello World");
	}
}

public class InterfaceDemo04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X4 x=new X4();
		x.printA();
		x.printB();
		x.printC();
	}
}
