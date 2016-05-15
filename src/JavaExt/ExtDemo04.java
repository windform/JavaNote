package JavaExt;

class Person4{
	private String name;
	private int age;
	public Person4(String name,int age){
		this.setName(name);
		this.setAge(age);
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getInfo(){
		return "姓名："+this.getName()+";年龄："+this.getAge();
	}
}

class Student4 extends Person4{
	private String school;
	public Student4(String name,int age,String school){
		super(name,age);
		this.setSchool(school);
	}
	public String getSchool(){
		return school;
	}
	public void setSchool(String school){
		this.school=school;
	}
	public String getInfo(){
		return super.getInfo()+";学校："+this.getSchool();
	}
}
public class ExtDemo04{
	public static void  main(String[] args){
		Student4 stu = new Student4("张三",45,"清华大学");
		System.out.println(stu.getInfo());
		
	}
}
