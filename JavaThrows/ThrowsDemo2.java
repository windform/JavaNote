package JavaThrows;
/*Throws �ؼ���
 * �ڶ���һ������ʱ����ʹ��throws�ؼ���������ʹ��shrows�����ķ�����ʾ�˷����������쳣�������������ĵ��ý��д���
 * �﷨��public ����ֵ���� �������ƣ������б�throws �쳣��{}
 * */

//����������ʹ��throws�ؼ���
class Math1{
	public int div(int j,int i) throws Exception{   //�������Բ������쳣
		int temp=j/i;		//�˴��п��ܲ����쳣
		return temp;		//���ؼ�����
	}
}

public class ThrowsDemo2 {
	//���������������쳣�����Բ�ʹ��try..catch������ʵ�ʲ����в���������������ʹ��throws�ؼ���
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Math1 m=new Math1();
		System.out.println("����������"+m.div(10, 2));

	}

}
