package JavaExt;

//方法的覆写
class Person3{
	void print(){
		System.out.println("Person3--> void print(){}");
	}
}
//子类覆写的方法权限缩小，在编译时会出现错误提示
class Student3 extends Person3{
	public void print(){
		super.print();  //super关键字调用父类的方法
		System.out.println("Student3--> void print(){}");
	}
}

public class ExtDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Student3().print();

	}

}
