package JavaDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
/*Calendarl��
Calendar����Խ�ȡ�õ��¼���ȷ�����룬�������һ��������
*/

//ȡ�õ�ǰϵͳ������
public class DateDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar01 = null;		//����һ��Calendar����
		calendar01 = new GregorianCalendar();	//ͨ������Ϊ��ʵ����
		System.out.println("�꣺"+calendar01.get(Calendar.YEAR));
		System.out.println("�£�"+calendar01.get(Calendar.MONTH));
		System.out.println("�գ�"+calendar01.get(Calendar.DAY_OF_MONTH));
		System.out.println("ʱ��"+calendar01.get(Calendar.HOUR_OF_DAY));
		System.out.println("�֣�"+calendar01.get(Calendar.MINUTE));
		System.out.println("�룺"+calendar01.get(Calendar.SECOND));
		System.out.println("���룺"+calendar01.get(Calendar.MILLISECOND));

	}

}
