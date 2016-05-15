package InnerClass;

class Outer1{
	private String info="Hello World";
	class Inner1{
		public void print(){
			System.out.println(info);
		}
	}
	public void fun(){
		new Inner1().print();
	}
}

public class InnerClassDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer1().fun();

	}

}
