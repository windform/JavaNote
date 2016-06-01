package JavaGlobal;
/*���ʻ�����
 * Java���ʻ��Ĳ�������ͨ���������������
 * java.util.Locale:���ڱ�ʾһ�����������ࣻ
 * Java.util.ResourceBundle:���ڷ�����Դ�ļ���
 * java.text.MessageFormate:��ʽ����Դ�ļ���ռλ�ַ�����
 * */

//����̬�ı�
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;   //������Դ��


public class InterDemo03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale zhLoc3 = new Locale("zh","CN");   //��ʾ�й�����
		Locale enLoc3 = new Locale("en","US");   //��ʾ��������
		Locale frLoc3 = new Locale("fr","FR");   //��ʾ��������
		
		ResourceBundle zhrb3 = ResourceBundle.getBundle("Message",zhLoc3);
		ResourceBundle enrb3 = ResourceBundle.getBundle("Message",enLoc3);
		ResourceBundle frrb3 = ResourceBundle.getBundle("Message",frLoc3);
		
		String str1 = zhrb3.getString("info");
		String str2 = enrb3.getString("info");
		String str3 = frrb3.getString("info");
		
		System.out.println("���ģ�"+MessageFormat.format(str1, "����"));
		System.out.println("Ӣ�"+MessageFormat.format(str2, "WhiteBlue"));
		System.out.println("���"+MessageFormat.format(str3, "WhiteBlue"));

	}

}
