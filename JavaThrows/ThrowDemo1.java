package JavaThrows;
/*Throw �ؼ���
 * ��throws�ؼ��ֲ�ͬ���ǣ�����ֱ��ʹ��throw�ؼ�����Ϊ���׳�һ���쳣���׳�ʱֱ���׳��쳣���ʵ�������󼴿�
 * throw���ᵥ��ʹ�� */

public class ThrowDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new Exception("�Լ��׳��쳣");
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

}
