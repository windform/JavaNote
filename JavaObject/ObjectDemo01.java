package JavaObject;

/*Object类
 * Java中所有的类都有一个公共的父类Object，一个类只要没有明显地继承一个类，则肯定是Object类的子类
 * */
class Demo1{
	//定义Demo1类，实际上继承了Object类
}

class Person1{
	private String name;
	private int age;
	public Person1(String name,int age){
		this.name=name;
		this.age=age;
	} 
	public String toString(){   //覆写父类Object类的toString()方法
		return "姓名:"+this.name+";年龄："+this.age;
	}
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(!(obj instanceof Person1)){
			return false;
		}
		Person1 per=(Person1)obj;
		if(per.name.equals(this.name) && per.age == age){
			return true;
		}else{
			return false;
		}
	}
}

public class ObjectDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d=new Demo1();
		System.out.println("不加toString()输出："+d);
		System.out.println("加toString()输出："+d.toString());
		System.out.println("============================");
		Person1 per=new Person1("托马什",45);
		System.out.println("对象信息："+per);
		System.out.println("============================");
		Person1 per1=new Person1("李兴华",34);
		Person1 per2=new Person1("李兴华",34);
		System.out.println(per1.equals(per2)? "是同一个人" : "不是同一个人");
		System.out.println(per1.equals("李星华")? "是同一个人" : "不是同一个人");

	}

}
