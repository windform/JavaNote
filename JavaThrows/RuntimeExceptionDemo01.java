package JavaThrows;
/*Exception����RuntimeException��
 * Exception ��RuntimeException �Ĺ�ϵ
 * Exception>RuntimeException>lllegalArgumentException>NumberFormatException
 * Exception�ڳ����б���ʹ��try...catch���д���
 * RuntimeException���Բ�ʹ��try...catch���д�������������쳣���������쳣����JVM���д���
 * */
public class RuntimeExceptionDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="123";
		int temp=Integer.parseInt(str);
		System.out.println(temp*temp);

	}

}
