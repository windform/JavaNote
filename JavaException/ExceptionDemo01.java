package JavaException;

/*�쳣�Ļ�������
 * 
 * try{
 *�п��ܳ����쳣�����
 *}catch(�쳣�� �쳣����){
 *��д�쳣�Ĵ������
 *}*/

//���쳣���в�׽
public class ExceptionDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*********���㿪ʼ***********");
		int i=10;
		int j=0;
		try{
		int temp=i/j;     //�˴������쳣
		System.out.println("������������Ľ����"+temp);
		}catch(ArithmeticException e){
			System.out.println("�������쳣��"+e);
		}finally{
			System.out.println("�����Ƿ�����쳣����ִ�д˴���");
		}
		System.out.println("**********�������******************");
	}

}
