package JavaQuote;

public class RefDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="hello";
		System.out.println("fun方法调用前："+str1);
		fun(str1);
		System.out.println("fun方法调用后:"+str1);
	}
	public static void fun(String str2){
		str2="MLDN";
	}

}
