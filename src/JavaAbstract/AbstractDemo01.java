package JavaAbstract;
/*������Ļ�������
 * 1������һ�����󷽷���������ǳ����ࣻ
 * 2��������ͳ��󷽷���Ҫʹ��abstract�ؼ��֣�
 * 3�����󷽷�ֻ��Ҫ��������Ҫʵ�֣�
 * ��������뱻�Ӽ̳У�������븲д�������е����г��󷽷���
 */
abstract class A1{
	public static final String FLAG="CHINA";
	private String name="whiteblue";
	public A1(){
		System.out.println("�������еĹ��췽��");
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public abstract void print();
}

class B1 extends A1{
	public B1(){
		System.out.println("����������Ĺ��췽��");
	}
	public void print(){
		System.out.println("FLAG="+FLAG);
		System.out.println("����:"+super.getName());
	}
}

public class AbstractDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b = new B1();
		b.print();

	}

}
