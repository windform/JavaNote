package JavaInterface;

/* �ӿڵĻ�������
 * 1���ӿ��������дpublic����Ҳ��public�ķ���Ȩ�ޣ�
 * 2���ӿ�����ȫ�ֳ����ͳ��󷽷���ɵģ�
 * 3���ӿ���Ҫʹ��Ҳ����ͨ�����࣬����ͨ��implements�ؼ���ʵ�ֽӿ�
 * */
interface A1{
	public String AUTHOR="�ζ�";   //�ȼ���public static final String 
	public void print();   //������󷽷����ȼ��� public abstract void
	public String getInfo();
}
interface B1{
	public void say();
}
class X1 implements A1,B1{
	public void say(){  //��дB1�ӿ��еĳ��󷽷�
		System.out.println("Hello World");
	}
	public String getInfo(){  //��дA�ӿڵ�getInfo()����
		return "HELLO";
	}
	public void print(){   //��дA�ӿڵ�print()����
		System.out.println("���ߣ�"+AUTHOR);
	}
}
public class InterfaceDemo01 {
	public static void main(String[] args){
		X1 x= new X1();
		System.out.println(x.getInfo());
		x.say();
		x.print();
	}

}
