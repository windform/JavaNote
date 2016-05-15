package InnerClass;

//在外部类访问内部类
class Outer4{
	private String info="hello world";
	class Inner4{
		public void print(){
			System.out.println(info);
		}
	}
}

public class InnerClassDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer4 out=new Outer4();  //实例化外部类对象
		Outer4.Inner4 in=out.new Inner4();  //实例化内部类对象
		in.print();

	}

}
