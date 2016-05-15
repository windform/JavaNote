package JavaNoInner;
/*匿名内部类
 * */
interface A2{
	public void printInfo();
}
class B2 implements A2{
	public void printInfo(){
		System.out.println("Hello World");
	}
}
class X2{
	public void fun1(){
		this.fun2(new A2(){
			public void printInfo(){
				System.out.println("Hello world");
			}
		});
	}
	public void fun2(A2 a){
		a.printInfo();
	}
	
}
public class NoInnerClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new X2().fun1();

	}

}
