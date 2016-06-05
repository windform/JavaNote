package JavaDate;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
/*DateFormat类:日期时间格式化*/

public class DateDemo03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df1 = null;
		DateFormat df2 = null;
		df1=DateFormat.getDateInstance();	//取得日期
		df2=DateFormat.getDateTimeInstance();	//取得日期时间
		System.out.println("Date:"+df1.format(new Date()));
		System.out.println("DATETIME:"+df2.format(new Date()));
		System.out.println("-------------------------------------");
		
		//指定显示风格的日期时间
		DateFormat df3 = null;
		DateFormat df4 = null;
		
		//取得日期,并设置日期显示风格
		df3=DateFormat.getDateInstance(DateFormat.YEAR_FIELD,new Locale("zh","CN"));	
		
		//取得日期时间,并设置日期的显示格式、时间的显示格式
		df4=DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD,DateFormat.ERA_FIELD,new
				 Locale("zh","CN"));	
		System.out.println("Date:"+df3.format(new Date()));
		System.out.println("DATETIME:"+df4.format(new Date()));
		
		


	}

}
