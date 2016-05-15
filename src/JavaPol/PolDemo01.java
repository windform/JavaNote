package JavaPol;

/*对象的多态性
 * 对象向上转型：父类  父类对象=子类示例
 * 对象向下转型： 子类 子类对象=(子类)父类实例；
 * */

//定义类A1
class A1{
	//定义fun1()方法
	public void fun1(){
		System.out.println("A1--> public void fun1(){}");
	}
	//定义fun2()方法
	public void fun2(){
		this.fun1();
	}
}

class B1 extends A1{
	//覆写父类中的fun1()方法
	public void fun1(){
		System.out.println("B1--> public void fun1(){}");
	}
	//子类自己定义的方法fun3
	public void fun3(){
		System.out.println("B1--> public void fun3(){}");
	}
}
public class PolDemo01 {
	public static void main(String args[]){
		B1 b1=new B1();   //子类对象实例化
		A1 a1=b1;   //发生向上转型的关系，子类-->父类
		a1.fun1();
		System.out.println("------------------");
		A1 a2=new B1();  //发生向上转型的关系，子类-->父类
		B1 b2=(B1) a2;   //发生向下转型关系
		b2.fun1();
		b2.fun2();
		b2.fun3();
		
	}

}
