package JavaInterfaceCase;

//在一个接口中包含抽象类
interface A9{  //定义接口A
	public abstract void printA();   //定义抽象方法
	abstract class B{
		public abstract void printB();
	}
}
class X9 implements A9{
	public void printA(){
		System.out.println("HELLO-->A");
	}
	class Y extends B{
		public void printB(){
			System.out.println("HELLO-->B");
		}
	}
}

public class InterfaceCaseDemo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A9.B b=new X9().new Y();
		b.printB();

	}

}
