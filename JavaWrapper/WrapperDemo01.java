package JavaWrapper;

//װ��Ͳ���
public class WrapperDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//װ�估�������
		int x=30;  //����һ��������������
		Integer i=new Integer(x);   //װ�䣺�������������ͱ�Ϊ��װ��
		int temp=i.intValue();     //���䣺��һ����װ���Ϊ������������
		
		//������װ�估����
		float f = 30.3f;
		Float x1=new Float(f);  //װ��
		float y1=x1.floatValue(); //����
		
		//�Զ�װ�估�������
		Integer j=30;  //�Զ�װ���Integer
		Float f1=30.3f;   //�Զ�װ���Float
		int x2=j;       //�Զ������int
		float y2=f1;      //�Զ������float
	}

}
