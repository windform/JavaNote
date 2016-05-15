package JavaInstanceof;
/*
 * java中可以使用instanceof 关键字判断一个对象到底是哪个类的实例
 * 语法：对象 instanceof 类  -->返回 boolean 类型
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

public class InstanceofDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1= new B1();
		System.out.println("A1 a1=new B1():"+(a1 instanceof A1));
		System.out.println("A1 a1=new B1():"+(a1 instanceof B1));
		A1 a2=new A1();
		System.out.println("A1 a2=new A1():"+(a2 instanceof A1));
		System.out.println("A1 a2=new A1():"+(a2 instanceof B1));

	}

}
