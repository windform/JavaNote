package project;

public class StringAPIDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="hello";
		//�ַ������ַ�������໥ת��
		char c[]=str1.toCharArray();
		for(int i=0; i<c.length; i++){
			System.out.print(c[i]+"\t");
		}
		System.out.println("");
		String str2=new String(c);
		String str3=new String(c,0,3);
		System.out.println(str2);
		System.out.println(str3);
		//���ַ����г��ָ��λ�õ��ַ�
		System.out.println(str1.charAt(1));
		//�ַ�����byte�����ת��
		byte b[]=str1.getBytes();
		for(int i=0; i<b.length; i++){
			System.out.print(b[i]+"\t");
		}
		System.out.println("");
		String str4=new String(c);
		String str5=new String(c,1,3);
		System.out.println(str4);
		System.out.println(str5);
		//ȡ���ַ����ĳ���
		System.out.println(str1.length());
		//����һ��ָ�����ַ����Ƿ����
		System.out.println(str1.indexOf("h"));
		System.out.println(str1.indexOf("l",1));
		System.out.println(str1.indexOf("b"));
		//ȥ���ַ������ҵĿո�
		String str6="        whiteblue      ";
		str6=str6.trim();
		System.out.println(str6);
		//�ַ�����ȡ
		String str7="How aRe yoU Boy";
		System.out.println(str7.substring(6));
		System.out.println(str7.substring(3,7));
		//����ַ���
		String s[]=(str7.trim()).split("");
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+"\t");
		}
		//�ַ����Ĵ�Сдת��
		System.out.println("");
		System.out.println(str7.toUpperCase());
		System.out.println(str7.toLowerCase());
		if(str7.startsWith("H")){
			System.out.println("str7 ����H��ͷ");
		}
		if(str7.endsWith("y")){
			System.out.println("str7 ����y��β");
		}
		//�����ִ�Сд�����ַ����Ƚ�
		String str8="how are you boy";
		System.out.println(str7.equals(str8));
		System.out.println(str7.equalsIgnoreCase(str8));
		//��һ��ָ�����ַ����滻�������ַ���
		System.out.println(str8.replaceAll("o", "l"));
		

	}

}
