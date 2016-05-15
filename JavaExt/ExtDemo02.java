package JavaExt;
class Person1{
	private String name;
	private int age;
	public Person1(){
		System.out.println("父类Person1中的构造");
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
}

//继承:只允许多层继承
//子类不能直接访问父类中的私有成员；
//子类可以调用父类中的非私有方法，但不能直接调用父类中的私有成员
class Student1 extends Person1{
	private String school;
	public Student1(){
		System.out.println("子类student1中的构造");
	}
	public String getSchool(){
		return school;
	}
	public void setSchool(String school){
		this.school=school;
	}
}

public class ExtDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 stu=new Student1();
		stu.setName("张三丰");
		stu.setAge(30);
		stu.setSchool("武当山武术学院");
		System.out.println("姓名："+stu.getName()+";年龄："+stu.getAge()+";学校："+stu.getSchool());

	}

}
