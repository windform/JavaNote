package JavaInterface;

//������ʵ�ֽӿ�

//����ӿ�A3
interface A3{
	public String AUTHOR="�ζ�";   //�ȼ���public static final String 
	public void print();   //������󷽷����ȼ��� public abstract void
	public String getInfo();
}

//���������B3,ʵ�ֽӿ�
abstract class B3 implements A3{
	public abstract void say();
}
class X3 extends B3{
	public void say(){  //��д������B3�ĳ��󷽷�
		System.out.println("Hello World");
	}
	public String getInfo(){  //��д������B3��getInfo()����
		return "HELLO";
	}
	public void print(){   //��д������B3��print()����
		System.out.println("���ߣ�"+AUTHOR);
	}
}
public class InterfaceDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X3 x = new X3();
		x.say();
		x.print();
	}
}
