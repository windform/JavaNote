package JavaGlobal;
/*国际化程序
 * Java国际化的操作必须通过以下三个类完成
 * java.util.Locale:用于表示一个国家语言类；
 * Java.util.ResourceBundle:用于访问资源文件；
 * java.text.MessageFormate:格式化资源文件的占位字符串；
 * */

//处理动态文本
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;   //引入资源类


public class InterDemo03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale zhLoc3 = new Locale("zh","CN");   //表示中国地区
		Locale enLoc3 = new Locale("en","US");   //表示美国地区
		Locale frLoc3 = new Locale("fr","FR");   //表示法国地区
		
		ResourceBundle zhrb3 = ResourceBundle.getBundle("Message",zhLoc3);
		ResourceBundle enrb3 = ResourceBundle.getBundle("Message",enLoc3);
		ResourceBundle frrb3 = ResourceBundle.getBundle("Message",frLoc3);
		
		String str1 = zhrb3.getString("info");
		String str2 = enrb3.getString("info");
		String str3 = frrb3.getString("info");
		
		System.out.println("中文："+MessageFormat.format(str1, "蓝白"));
		System.out.println("英语："+MessageFormat.format(str2, "WhiteBlue"));
		System.out.println("法语："+MessageFormat.format(str3, "WhiteBlue"));

	}

}
