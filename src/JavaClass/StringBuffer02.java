package JavaClass;
//StringBuffer���

public class StringBuffer02 {

	public static void main(String[] args) {
		//������λ�ô�ΪStringBuffer�������
		StringBuffer buf = new StringBuffer();
		buf.append("hello");
		buf.insert(5," world");
		buf.insert(buf.length(), " java! ");
		//fun(buf);
		
		System.out.println(buf);
		//�ַ����ķ�ת����
		String str=buf.reverse().toString();
		System.out.println(str);
		System.out.println(buf);
		
	}
	

}
