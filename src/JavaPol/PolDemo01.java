package JavaPol;

/*����Ķ�̬��
 * ��������ת�ͣ�����  �������=����ʾ��
 * ��������ת�ͣ� ���� �������=(����)����ʵ����
 * */

//������A1
class A1{
	//����fun1()����
	public void fun1(){
		System.out.println("A1--> public void fun1(){}");
	}
	//����fun2()����
	public void fun2(){
		this.fun1();
	}
}

class B1 extends A1{
	//��д�����е�fun1()����
	public void fun1(){
		System.out.println("B1--> public void fun1(){}");
	}
	//�����Լ�����ķ���fun3
	public void fun3(){
		System.out.println("B1--> public void fun3(){}");
	}
}
public class PolDemo01 {
	public static void main(String args[]){
		B1 b1=new B1();   //�������ʵ����
		A1 a1=b1;   //��������ת�͵Ĺ�ϵ������-->����
		a1.fun1();
		System.out.println("------------------");
		A1 a2=new B1();  //��������ת�͵Ĺ�ϵ������-->����
		B1 b2=(B1) a2;   //��������ת�͹�ϵ
		b2.fun1();
		b2.fun2();
		b2.fun3();
		
	}

}
