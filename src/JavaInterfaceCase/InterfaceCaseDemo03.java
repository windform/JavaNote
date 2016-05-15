package JavaInterfaceCase;

//�������ʵ��Ӧ��-ģ�����

//���������Person
abstract class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void say(){
		System.out.println(this.getContent());
	}
	public abstract String getContent();
}

class Student extends Person{
	private float score;
	public Student(String name,int age,float score){
		super(name,age);
		this.score=score;
	}
	public String getContent(){
		return "ѧ����Ϣ-->����:"+super.getName()+
				";���䣺"+super.getAge()+
				";������"+this.score;		
	}
}

class Worker extends Person{
	private float salary;
	public Worker(String name,int age,float salary){
		super(name,age);
		this.salary=salary;	
	}
	public String getContent(){
		return "������Ϣ-->����:"+super.getName()+
				";���䣺"+super.getAge()+
				";нˮ��"+this.salary;
	}
}

public class InterfaceCaseDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per1 = new Student("����",23,99.0f);
		Person per2 = new Worker("����",45,8000.0f);
		per1.say();
		per2.say();

	}

}
