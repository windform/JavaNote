package JavaInterface;
/*�̳г�����ʵ�ֽӿ�
 * �﷨��class ���� extends ������ implements �ӿ�A,�ӿ�B
 * */


//����ӿ�A2
interface A2{
	public String AUTHOR="�ζ�";   //�ȼ���public static final String 
	public void print();   //������󷽷����ȼ��� public abstract void
	public String getInfo();
}

//���������B2
abstract class B2{
	public abstract void say();
}
class X2 extends B2 implements A2{
	public void say(){  //��дB2�ӿ��еĳ��󷽷�
		System.out.println("Hello World");
	}
	public String getInfo(){  //��дA2�ӿڵ�getInfo()����
		return "HELLO";
	}
	public void print(){   //��дA2�ӿڵ�print()����
		System.out.println("���ߣ�"+AUTHOR);
	}
}

public class InterfaceDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X2 x= new X2();
		System.out.println(x.getInfo());
		x.say();
		x.print();

	}

}
