package JavaInstanceof;
/*
 * java�п���ʹ��instanceof �ؼ����ж�һ�����󵽵����ĸ����ʵ��
 * �﷨������ instanceof ��  -->���� boolean ����
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

public class InstanceofDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1= new B1();
		System.out.println("A1 a1=new B1():"+(a1 instanceof A1));
		System.out.println("A1 a1=new B1():"+(a1 instanceof B1));
		A1 a2=new A1();
		System.out.println("A1 a2=new A1():"+(a2 instanceof A1));
		System.out.println("A1 a2=new A1():"+(a2 instanceof B1));

	}

}
