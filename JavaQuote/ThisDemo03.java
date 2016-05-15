package JavaQuote;

//使用this调用构造方法
class Person3{
	private String name;
	private int age;
	public Person3(){
		System.out.println("一个新的Person对象被实例化");
	}
	public Person3(String name,int age){
		this();
		this.name=name;
		this.age=age;
	}
	public String getInfo(){
		return "姓名："+name+",年龄："+age;
	}
}

public class ThisDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person3 per1=new Person3("张三",33);
		System.out.println(per1.getInfo());

	}

}
