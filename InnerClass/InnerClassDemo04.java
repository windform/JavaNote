package InnerClass;

//���ⲿ������ڲ���
class Outer4{
	private String info="hello world";
	class Inner4{
		public void print(){
			System.out.println(info);
		}
	}
}

public class InnerClassDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer4 out=new Outer4();  //ʵ�����ⲿ�����
		Outer4.Inner4 in=out.new Inner4();  //ʵ�����ڲ������
		in.print();

	}

}
