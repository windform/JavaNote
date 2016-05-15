package JavaQuote;

class Demo{
	int temp=30;
}

public class RefDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();
		d1.temp=50;
		System.out.println("fun方法调用前："+d1.temp);
		fun(d1);
		System.out.println("fun方法调用后:"+d1.temp);
	}
	public static void fun(Demo d2){
		d2.temp=1000;
	}

}
