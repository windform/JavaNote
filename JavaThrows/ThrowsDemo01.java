package JavaThrows;
/*Throws �ؼ���
 * �ڶ���һ������ʱ����ʹ��throws�ؼ���������ʹ��shrows�����ķ�����ʾ�˷����������쳣�������������ĵ��ý��д���
 * �﷨��public ����ֵ���� �������ƣ������б�throws �쳣��{}
 * */

class Math{
	public int div(int j,int i) throws Exception{   //�������Բ������쳣
		int temp=j/i;		//�˴��п��ܲ����쳣
		return temp;		//���ؼ�����
	}
}

public class ThrowsDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math m=new Math();
		try{						//��Ϊ��throws�������Ƿ����쳣�������봦��
			System.out.println("����������"+m.div(10, 2));
		}catch(Exception e){
			e.printStackTrace();   //��ӡ�쳣
		}

	}

}
