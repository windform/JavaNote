package JavaNoInner;
/*匿名内部类
 * */
interface A1{
	public void printInfo();
}
class B1 implements A1{
	public void printInfo(){
		System.out.println("Hello World");
	}
}
class X{
	public void fun1(){
		this.fun2(new B1());
	}
	public void fun2(A1 a){
		a.printInfo();
	}
}
public class NoInnerClassDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new X().fun1();

	}

}
