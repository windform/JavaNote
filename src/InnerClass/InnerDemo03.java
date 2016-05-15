package InnerClass;

//使用static定义内部类，此时的内部类不能访问非static的外部类属性
class Outer3{
	private static String info = "hello world";
	static class Inner3{
		public void print(){
			System.out.println(info);
		}
	}
}

public class InnerDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer3.Inner3().print();

	}

}
