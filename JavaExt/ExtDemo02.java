package JavaExt;
class Person1{
	private String name;
	private int age;
	public Person1(){
		System.out.println("����Person1�еĹ���");
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

//�̳�:ֻ������̳�
//���಻��ֱ�ӷ��ʸ����е�˽�г�Ա��
//������Ե��ø����еķ�˽�з�����������ֱ�ӵ��ø����е�˽�г�Ա
class Student1 extends Person1{
	private String school;
	public Student1(){
		System.out.println("����student1�еĹ���");
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
		stu.setName("������");
		stu.setAge(30);
		stu.setSchool("�䵱ɽ����ѧԺ");
		System.out.println("������"+stu.getName()+";���䣺"+stu.getAge()+";ѧУ��"+stu.getSchool());

	}

}
