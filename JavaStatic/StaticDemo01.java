package JavaStatic;
//static 关键字生命全局属性
class Person1{
	String name;
	int age;
	static String country="A 城市";
	public Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void info(){
		System.out.println("姓名："+this.name+",年龄："+this.age+",城市："+country);
	}
}

public class StaticDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1=new Person1("张三",34);
		Person1 p2=new Person1("李四",56);
		Person1 p3=new Person1("王五",87);
		System.out.println("------------修改前----------------");
		p1.info();
		p2.info();
		p3.info();
		System.out.println("------------修改后----------------");
		Person1.country="西雅图";
		p1.info();
		p2.info();
		p3.info();

	}

}
