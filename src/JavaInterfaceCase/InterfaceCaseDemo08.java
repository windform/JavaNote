package JavaInterfaceCase;
/*内部类的扩展
 * 实际上一个抽象类也可以定义多个接口或抽象类，在一个接口中也可以定义多个抽象类或接口
 * */
abstract class A{
	public abstract void printA();
	interface B{    //定义内部接口
		public void printB();   //定义抽象方法
	}
}
class X extends A{   //继承抽象类
	public void printA(){
		System.out.println("HELLO-->A");
	}
	class Y implements B{  //定义内部类实现内部接口
		public void printB(){
			System.out.println("HELLO-->B");
		}
	}
}
public class InterfaceCaseDemo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.B b = new X().new Y();
		b.printB();

	}

}
