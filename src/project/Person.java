package project;

public class Person {
	private String name;
	private int age;
	public Person(String name,int age){
		this.setName(name);
		this.setAge(age);
	};
	public void tell(){
		System.out.println("ÐÕÃû£º"+getName()+",ÄêÁä£º"+getAge());
	};
	public String getName(){
		return name;
	};
	public void setName(String n){
		name=n;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int a){
		if(a>=0 && a<150){
			age=a;
		}
	}

}
