package JavaQuote;

class Demo1{
	String temp="hello";
}

public class RefDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 d1=new Demo1();
		d1.temp="world";
		System.out.println("fun方法调用前："+d1.temp);
		fun(d1);
		System.out.println("fun方法调用后:"+d1.temp);

	}
	
	public static void fun(Demo1 d2){
		d2.temp="MLDN";
	}

}
