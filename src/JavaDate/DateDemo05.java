package JavaDate;
import java.text.SimpleDateFormat;
import java.util.Date;
/*SimpleDateFormat�ࣺ�����ڼ�String��ΪDate������*/

//��String�����ݱ�ΪDate������
public class DateDemo05 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String strDate02 = "2016-10-19 10:11:30";
		String pat3 = "yyy-MM-dd HH:mm:ss:SS";
		SimpleDateFormat sdf3 = new SimpleDateFormat(pat3);
		Date d1 = sdf3.parse(strDate02);

		System.out.println(d1);
	}

}
