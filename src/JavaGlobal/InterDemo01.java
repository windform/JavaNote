package JavaGlobal;
/*���ʻ�����
 * Java���ʻ��Ĳ�������ͨ���������������
 * java.util.Locale:���ڱ�ʾһ�����������ࣻ
 * Java.util.ResourceBundle:���ڷ�����Դ�ļ���
 * java.text.MessageFormate:��ʽ����Դ�ļ���ռλ�ַ�����*/

import java.util.ResourceBundle;   //������Դ��

public class InterDemo01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle rb = ResourceBundle.getBundle("messages"); 
		System.out.println("���ݣ�"+rb.getString("info"));

	}

}
