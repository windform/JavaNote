package JavaInterfaceCase;

//Ϊ�ӿ�ʵ����
interface A2{   //���������A1
	public abstract void print();
}
class B2 implements A2{   //����̳г�����
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
