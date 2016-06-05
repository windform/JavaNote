package JavaDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
/*Calendarl类
Calendar类可以将取得的事件精确到毫秒，这个类是一个抽象类
*/

//取得当前系统的日期
public class DateDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar01 = null;		//声明一个Calendar对象
		calendar01 = new GregorianCalendar();	//通过子类为其实例化
		System.out.println("年："+calendar01.get(Calendar.YEAR));
		System.out.println("月："+calendar01.get(Calendar.MONTH));
		System.out.println("日："+calendar01.get(Calendar.DAY_OF_MONTH));
		System.out.println("时："+calendar01.get(Calendar.HOUR_OF_DAY));
		System.out.println("分："+calendar01.get(Calendar.MINUTE));
		System.out.println("秒："+calendar01.get(Calendar.SECOND));
		System.out.println("毫秒："+calendar01.get(Calendar.MILLISECOND));

	}

}
