package JavaThrows;
/*Exception类与RuntimeException类
 * Exception 与RuntimeException 的关系
 * Exception>RuntimeException>lllegalArgumentException>NumberFormatException
 * Exception在程序中必须使用try...catch进行处理
 * RuntimeException可以不使用try...catch进行处理，但是如果有异常产生，则异常将由JVM进行处理
 * */
public class RuntimeExceptionDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="123";
		int temp=Integer.parseInt(str);
		System.out.println(temp*temp);

	}

}
