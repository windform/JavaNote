package JavaDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*SimpleDateFormat�ࣺ�����ڼ�String��ΪDate������*/

public class DateDemo04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������ʱ����ַ���
		String strDate01 = "2016-10-19 10:11:30";
		//׼���õ�һ��ģ�壬���ַ�������ȡ��������
		String pat1 = "yyy-MM-dd HH:mm:ss:SS";
		//׼���õڶ���ģ�壬����ȡ�����������ת��Ϊָ���ĸ�ʽ
		String pat2 = "yyy �� MM �� dd �� HH ʱ mm �� ss �� SS ����";
		SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);   //ʵ����ģ�����
		SimpleDateFormat sdf2 = new SimpleDateFormat(pat2);   //ʵ����ģ�����
		Date d = null;
		try{
			d = sdf1.parse(strDate01);   //���������ַ����е�������ȡ����
		}catch(ParseException e){
			e.printStackTrace();
		}
		System.out.println(sdf2.format(d));
	}

}
