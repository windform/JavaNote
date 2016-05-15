package JavaInterface;

/* 接口的基本概念
 * 1、接口中如果不写public，则也是public的访问权限；
 * 2、接口是由全局常量和抽象方法组成的；
 * 3、接口若要使用也必须通过子类，子类通过implements关键字实现接口
 * */
interface A1{
	public String AUTHOR="廖东";   //等价于public static final String 
	public void print();   //定义抽象方法，等价于 public abstract void
	public String getInfo();
}
interface B1{
	public void say();
}
class X1 implements A1,B1{
	public void say(){  //覆写B1接口中的抽象方法
		System.out.println("Hello World");
	}
	public String getInfo(){  //覆写A接口的getInfo()方法
		return "HELLO";
	}
	public void print(){   //覆写A接口的print()方法
		System.out.println("作者："+AUTHOR);
	}
}
public class InterfaceDemo01 {
	public static void main(String[] args){
		X1 x= new X1();
		System.out.println(x.getInfo());
		x.say();
		x.print();
	}

}
