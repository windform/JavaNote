package JavaInterfaceCase;

/*��������ӿڵ�Ӧ��*/

//Ϊ������ʵ����
abstract class A1{   //���������A1
	public abstract void print();
}
class B1 extends A1{   //����̳г�����
	public void print(){
		System.out.println("Hello World");
	}
	
}

public class InterfaceCaseDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1 = new B1();  //ͨ������Ϊ������ʵ����
		a1.print();     //���õķ����Ǳ����าд���ķ���
		

	}

}
