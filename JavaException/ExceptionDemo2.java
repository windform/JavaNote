package JavaException;

/*�쳣�Ļ�������
 * 
 * try{
 *�п��ܳ����쳣�����
 *}catch(�쳣�� �쳣����){
 *��д�쳣�Ĵ������
 *}*/

//��׽����쳣
public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*********���㿪ʼ***********");
		int i=0;
		int j=0;
		try{
		String str1=args[0];
		String str2=args[1];
		i=Integer.parseInt(str1);
		j=Integer.parseInt(str2);
		int temp=i/j;
		System.out.println("������������Ľ����"+temp);
		}catch(ArithmeticException e){       //��׽�����쳣
			System.out.println("�������쳣��"+e);   //���������쳣
		}catch(NumberFormatException e){
			System.out.println("����ת���쳣��"+e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("����Խ���쳣��"+ e);
		}
		System.out.println("**********�������******************");
	}

}
