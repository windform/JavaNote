package project;

public class StringDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ֱ�Ӹ�ֵ
		String name="WhiteBlue";
		System.out.println("������"+name);
		//ʹ�ù��캯������ʵ����
		String name1=new String("BlueWhite");
		System.out.println("name:"+name1);
		int x=30;
		int y=30;
		System.out.println(x==y);
		String str1="hello";
		String str2=new String("hello");
		String str3=str2;
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str3);
		//equals:�����ַ������ݱȽ�
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
		

	}

}
