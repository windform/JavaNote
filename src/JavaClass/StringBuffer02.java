package JavaClass;
//StringBuffer类库

public class StringBuffer02 {

	public static void main(String[] args) {
		//在任意位置处为StringBuffer添加内容
		StringBuffer buf = new StringBuffer();
		buf.append("hello");
		buf.insert(5," world");
		buf.insert(buf.length(), " java! ");
		//fun(buf);
		
		System.out.println(buf);
		//字符串的反转操作
		String str=buf.reverse().toString();
		System.out.println(str);
		System.out.println(buf);
		
	}
	

}
