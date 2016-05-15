package JavaSingle;

class Singleton1{
	private static Singleton1 instance = new Singleton1();
	
	//构造方法私有化封装
	private Singleton1(){}
	
	public static Singleton1 getInstance(){
		return instance;
	}
	public void print(){
		System.out.println("Hello World");
	}
}

public class SingleDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton1 s1=Singleton1.getInstance();
		Singleton1 s2=Singleton1.getInstance();
		Singleton1 s3=Singleton1.getInstance();
		s1.print();
		s2.print();
		s3.print();

	}

}
