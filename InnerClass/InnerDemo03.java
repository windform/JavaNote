package InnerClass;

//ʹ��static�����ڲ��࣬��ʱ���ڲ��಻�ܷ��ʷ�static���ⲿ������
class Outer3{
	private static String info = "hello world";
	static class Inner3{
		public void print(){
			System.out.println(info);
		}
	}
}

public class InnerDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer3.Inner3().print();

	}

}
