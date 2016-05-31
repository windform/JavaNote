package JavaGlobal;
/*国际化程序
 * Java国际化的操作必须通过以下三个类完成
 * java.util.Locale:用于表示一个国家语言类；
 * Java.util.ResourceBundle:用于访问资源文件；
 * java.text.MessageFormate:格式化资源文件的占位字符串；*/

import java.util.Locale;
import java.util.ResourceBundle;   //引入资源类

public class InterDemo02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale zhLoc = new Locale("zh","CN");   //表示中国地区
		Locale enLoc = new Locale("en","US");   //表示美国地区
		Locale frLoc = new Locale("fr","FR");   //表示法国地区
		
		ResourceBundle zhrb = ResourceBundle.getBundle("Message",zhLoc);
		ResourceBundle enrb = ResourceBundle.getBundle("Message",enLoc);
		ResourceBundle frrb = ResourceBundle.getBundle("Message",frLoc);
		
		System.out.println("中文："+zhrb.getString("info"));
		System.out.println("英语："+enrb.getString("info"));
		System.out.println("法语："+frrb.getString("info"));

	}

}
