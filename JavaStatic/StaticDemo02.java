package JavaStatic;
//ͳ��һ��������˶��ٸ�ʵ������
class Demo2{
	static int count=0;
	public Demo2(){
		count++;
		System.out.println("������"+count+"������");
	}
}
public class StaticDemo02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo2();
		new Demo2();
		new Demo2();
		new Demo2();
	}
}
