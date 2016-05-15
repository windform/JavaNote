package JavaStatic;
//统计一个类产生了多少个实例对象
class Demo2{
	static int count=0;
	public Demo2(){
		count++;
		System.out.println("产生了"+count+"个对象");
	}
}
public class StaticDemo02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo2();
		new Demo2();
		new Demo2();
		new Demo2();
	}
}
