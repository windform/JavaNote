package JavaInterface;

/*�ӿڵļ̳�
 * 1���﷨��interface �ӽӿ� extends ���ӿ�A,���ӿ�B
 * */

//����ӿ�A4
interface A4{
	public String AUTHOR="����";
	public void printA();
}
//����ӿ�B4
interface B4{
	public void printB();
}
//����ӿ�C4��ͬʱ�̳нӿ�A4��B4
interface C4 extends A4,B4{
	public void printC();
}

class X4 implements C4{
	public void printA(){  
		System.out.println("A3-Hello World");
	}
	public void printB(){  
		System.out.println("B3-Hello World");
	}
	public void printC(){  
		System.out.println("C3-Hello World");
	}
}

public class InterfaceDemo04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X4 x=new X4();
		x.printA();
		x.printB();
		x.printC();
	}
}
