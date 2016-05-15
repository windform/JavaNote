package JavaPol;
class A3{
	public void fun1(){
		System.out.println("A3-->public void fun1(){}");
	}
	public void fun2(){
		this.fun1();
	}
}
class B3 extends A3{
	public void fun1(){
		System.out.println("B3-->public void fun1(){}");
	}
	public void fun3(){
		System.out.println("B3-->public void fun3(){}");
	}
}
class C3 extends A3{
	public void fun1(){
		System.out.println("C3-->public void fun1(){}");
	}
	public void fun5(){
		System.out.println("C3-->public void fun3(){}");
	}
}


public class PolDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(new B3());
		fun(new C3());
	}
	/*public static void fun(B3 b){
		b.fun1();
	}
	public static void fun(C3 c){
		c.fun1();
	}*/
	
	//多态化实际用途
	public static void fun(A3 a){
		a.fun1();
	}

}
