package JavaCode;

class Demo1{
	{
		System.out.println("1�������");
	}
	static{
		System.out.println("0����̬�����");
	}
	public Demo1(){
		System.out.println("2�����췽��");
	}
}
public class CodeDemo01 {
	static{
		System.out.println("�����������ж���Ĵ����");
	}
	public static void main(String args[]){
		new Demo1();
		new Demo1();
		new Demo1();
	}

}
