package JavaGlobal;
/*国际化程序
 * Java国际化的操作必须通过以下三个类完成
 * java.util.Locale:用于表示一个国家语言类；
 * Java.util.ResourceBundle:用于访问资源文件；
 * java.text.MessageFormate:格式化资源文件的占位字符串；*/

import java.util.ResourceBundle;   //引入资源类

public class InterDemo01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle rb = ResourceBundle.getBundle("messages"); 
		System.out.println("内容："+rb.getString("info"));

	}

}
