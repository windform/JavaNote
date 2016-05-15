package JavaStatic;
//使用static为对象自动编名
class Demo3{
	private String name;
	static int count=0;
	public Demo3(){
		count++;
		this.name="Demo3-"+count;
	}
	public Demo3(String name){
		this.name=name;
	}
	public String getName(){
		System.out.println(this.name);
		return null;
	}
}
public class StaticDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo3().getName();
		new Demo3("Java").getName();
		new Demo3().getName();
		new Demo3("JavaScript").getName();
		new Demo3().getName();

	}

}
