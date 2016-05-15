package JavaInterfaceCase;

/*抽象类与接口的应用*/

//为抽象类实例化
abstract class A1{   //定义抽象类A1
	public abstract void print();
}
class B1 extends A1{   //子类继承抽象类
	public void print(){
		System.out.println("Hello World");
	}
	
}

public class InterfaceCaseDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1 = new B1();  //通过子类为抽象类实例化
		a1.print();     //调用的方法是被子类覆写过的方法
		

	}

}
