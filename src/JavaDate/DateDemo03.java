package JavaDate;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
/*DateFormat��:����ʱ���ʽ��*/

public class DateDemo03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df1 = null;
		DateFormat df2 = null;
		df1=DateFormat.getDateInstance();	//ȡ������
		df2=DateFormat.getDateTimeInstance();	//ȡ������ʱ��
		System.out.println("Date:"+df1.format(new Date()));
		System.out.println("DATETIME:"+df2.format(new Date()));
		System.out.println("-------------------------------------");
		
		//ָ����ʾ��������ʱ��
		DateFormat df3 = null;
		DateFormat df4 = null;
		
		//ȡ������,������������ʾ���
		df3=DateFormat.getDateInstance(DateFormat.YEAR_FIELD,new Locale("zh","CN"));	
		
		//ȡ������ʱ��,���������ڵ���ʾ��ʽ��ʱ�����ʾ��ʽ
		df4=DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD,DateFormat.ERA_FIELD,new
				 Locale("zh","CN"));	
		System.out.println("Date:"+df3.format(new Date()));
		System.out.println("DATETIME:"+df4.format(new Date()));
		
		


	}

}
