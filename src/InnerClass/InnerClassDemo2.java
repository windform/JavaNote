package InnerClass;

//把内部类拿到外部
class Outer2{
	private String info="Hello World";
	public String getInfo(){
		return this.info;
	}
	public void fun(){
		new Inner2(this).print();
	}
}

class Inner2{
	private Outer2 out = null;
	public Inner2(Outer2 out){
		this.out=out;
	}
	public void print(){
		System.out.println(out.getInfo());
	}
}

public class InnerClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer1().fun();

	}

}
