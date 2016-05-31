package JavaGlobal;
/*���ʻ�����
 * Java���ʻ��Ĳ�������ͨ���������������
 * java.util.Locale:���ڱ�ʾһ�����������ࣻ
 * Java.util.ResourceBundle:���ڷ�����Դ�ļ���
 * java.text.MessageFormate:��ʽ����Դ�ļ���ռλ�ַ�����*/

import java.util.Locale;
import java.util.ResourceBundle;   //������Դ��

public class InterDemo02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale zhLoc = new Locale("zh","CN");   //��ʾ�й�����
		Locale enLoc = new Locale("en","US");   //��ʾ��������
		Locale frLoc = new Locale("fr","FR");   //��ʾ��������
		
		ResourceBundle zhrb = ResourceBundle.getBundle("Message",zhLoc);
		ResourceBundle enrb = ResourceBundle.getBundle("Message",enLoc);
		ResourceBundle frrb = ResourceBundle.getBundle("Message",frLoc);
		
		System.out.println("���ģ�"+zhrb.getString("info"));
		System.out.println("Ӣ�"+enrb.getString("info"));
		System.out.println("���"+frrb.getString("info"));

	}

}
