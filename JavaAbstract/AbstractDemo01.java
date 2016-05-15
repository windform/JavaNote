package JavaAbstract;
/*抽象类的基本概念
 * 1、包含一个抽象方法的类必须是抽象类；
 * 2、抽象类和抽象方法都要使用abstract关键字；
 * 3、抽象方法只需要声明不需要实现；
 * 抽象类必须被子继承，子类必须覆写抽象类中的所有抽象方法；
 */
abstract class A1{
	public static final String FLAG="CHINA";
	private String name="whiteblue";
	public A1(){
		System.out.println("抽象类中的构造方法");
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public abstract void print();
}

class B1 extends A1{
	public B1(){
		System.out.println("抽象类子类的构造方法");
	}
	public void print(){
		System.out.println("FLAG="+FLAG);
		System.out.println("姓名:"+super.getName());
	}
}

public class AbstractDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b = new B1();
		b.print();

	}

}
