package InnerClass;

//在方法中定义内部类，方法中的参数想要被内部类访问，则参数前需要加final关键字
class Outer5{
	private String info="hello world";
	public void fun(final int temp){
		class Inner5{
			public  void print(){
				System.out.println("类中的属性："+info);
				System.out.println("方法中的参数："+temp);
			}
		};
		new Inner5().print();
	}
}
public class InnerClassDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer5().fun(30);

	}

}
