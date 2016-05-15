package project;

public class StringAPIDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="hello";
		//字符串和字符数组的相互转化
		char c[]=str1.toCharArray();
		for(int i=0; i<c.length; i++){
			System.out.print(c[i]+"\t");
		}
		System.out.println("");
		String str2=new String(c);
		String str3=new String(c,0,3);
		System.out.println(str2);
		System.out.println(str3);
		//从字符串中抽出指定位置的字符
		System.out.println(str1.charAt(1));
		//字符串和byte数组的转换
		byte b[]=str1.getBytes();
		for(int i=0; i<b.length; i++){
			System.out.print(b[i]+"\t");
		}
		System.out.println("");
		String str4=new String(c);
		String str5=new String(c,1,3);
		System.out.println(str4);
		System.out.println(str5);
		//取得字符串的长度
		System.out.println(str1.length());
		//查找一个指定的字符串是否存在
		System.out.println(str1.indexOf("h"));
		System.out.println(str1.indexOf("l",1));
		System.out.println(str1.indexOf("b"));
		//去掉字符串左右的空格
		String str6="        whiteblue      ";
		str6=str6.trim();
		System.out.println(str6);
		//字符串截取
		String str7="How aRe yoU Boy";
		System.out.println(str7.substring(6));
		System.out.println(str7.substring(3,7));
		//拆分字符串
		String s[]=(str7.trim()).split("");
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+"\t");
		}
		//字符串的大小写转换
		System.out.println("");
		System.out.println(str7.toUpperCase());
		System.out.println(str7.toLowerCase());
		if(str7.startsWith("H")){
			System.out.println("str7 是以H开头");
		}
		if(str7.endsWith("y")){
			System.out.println("str7 是以y结尾");
		}
		//不区分大小写进行字符串比较
		String str8="how are you boy";
		System.out.println(str7.equals(str8));
		System.out.println(str7.equalsIgnoreCase(str8));
		//将一个指定的字符串替换成其他字符串
		System.out.println(str8.replaceAll("o", "l"));
		

	}

}
