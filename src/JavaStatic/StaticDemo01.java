package JavaStatic;
//static �ؼ�������ȫ������
class Person1{
	String name;
	int age;
	static String country="A ����";
	public Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void info(){
		System.out.println("������"+this.name+",���䣺"+this.age+",���У�"+country);
	}
}

public class StaticDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1=new Person1("����",34);
		Person1 p2=new Person1("����",56);
		Person1 p3=new Person1("����",87);
		System.out.println("------------�޸�ǰ----------------");
		p1.info();
		p2.info();
		p3.info();
		System.out.println("------------�޸ĺ�----------------");
		Person1.country="����ͼ";
		p1.info();
		p2.info();
		p3.info();

	}

}
