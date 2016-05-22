package JavaClass;
//StringBuffer类库

public class StringBuffer01 {

	public static void main(String[] args) {
		// 字符串连接操作
		//验证StringBuffer的内容是可以修改的
		StringBuffer buf = new StringBuffer();
		buf.append("hello");
		buf.append(" world").append(" !!!");
		buf.append("\n");
		buf.append("数字=").append(1).append("\n");
		buf.append("字符=").append("C").append("\n");
		buf.append("布尔=").append(true).append("\n");
		fun(buf);
		System.out.println(buf);
	}
	
	public static void fun(StringBuffer s){
		s.append(" 中国功夫 ").append(" 的象征 ");
	}

}
