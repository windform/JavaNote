package JavaExt;

//�����ĸ�д
class Person3{
	void print(){
		System.out.println("Person3--> void print(){}");
	}
}
//���าд�ķ���Ȩ����С���ڱ���ʱ����ִ�����ʾ
class Student3 extends Person3{
	public void print(){
		super.print();  //super�ؼ��ֵ��ø���ķ���
		System.out.println("Student3--> void print(){}");
	}
}

public class ExtDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Student3().print();

	}

}
