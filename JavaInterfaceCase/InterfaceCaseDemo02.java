package JavaInterfaceCase;

//为接口实例化
interface A2{   //定义抽象类A1
	public abstract void print();
}
class B2 implements A2{   //子类继承抽象类
	public void print(){
		System.out.println("Hello World");
	}	
}

public class InterfaceCaseDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a=new B2();
		a.print();

	}

}
