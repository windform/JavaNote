package JavaSystem;

//垃圾回收机制
class Person04{
	private String name;
	private int age;
	public Person04(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return "姓名："+this.name+",年龄："+this.age;
	}
	public void finalize() throws Throwable{    //对象释放空间时默认调用此方法
		System.out.println("对象被释放-->"+this);  //直接打印对象调用toString
	}
	
}
public class SystemDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person04 per = new Person04("张三",76);
		per = null;  //断开引用，释放空间
		System.gc(); 
		
		
	}

}
