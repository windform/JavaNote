package JavaDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*SimpleDateFormat类：常用于间String变为Date型数据*/

public class DateDemo04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义好日期时间的字符串
		String strDate01 = "2016-10-19 10:11:30";
		//准备好第一个模板，从字符串中提取日期数字
		String pat1 = "yyy-MM-dd HH:mm:ss:SS";
		//准备好第二个模板，将提取后的日期数字转化为指定的格式
		String pat2 = "yyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒 SS 毫秒";
		SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);   //实例化模板对象
		SimpleDateFormat sdf2 = new SimpleDateFormat(pat2);   //实例化模板对象
		Date d = null;
		try{
			d = sdf1.parse(strDate01);   //将给定的字符串中的日期提取出来
		}catch(ParseException e){
			e.printStackTrace();
		}
		System.out.println(sdf2.format(d));
	}

}
