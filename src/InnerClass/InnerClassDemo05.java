package InnerClass;

//�ڷ����ж����ڲ��࣬�����еĲ�����Ҫ���ڲ�����ʣ������ǰ��Ҫ��final�ؼ���
class Outer5{
	private String info="hello world";
	public void fun(final int temp){
		class Inner5{
			public  void print(){
				System.out.println("���е����ԣ�"+info);
				System.out.println("�����еĲ�����"+temp);
			}
		};
		new Inner5().print();
	}
}
public class InnerClassDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer5().fun(30);

	}

}
