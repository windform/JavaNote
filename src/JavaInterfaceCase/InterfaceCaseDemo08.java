package JavaInterfaceCase;
/*�ڲ������չ
 * ʵ����һ��������Ҳ���Զ������ӿڻ�����࣬��һ���ӿ���Ҳ���Զ������������ӿ�
 * */
abstract class A{
	public abstract void printA();
	interface B{    //�����ڲ��ӿ�
		public void printB();   //������󷽷�
	}
}
class X extends A{   //�̳г�����
	public void printA(){
		System.out.println("HELLO-->A");
	}
	class Y implements B{  //�����ڲ���ʵ���ڲ��ӿ�
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
