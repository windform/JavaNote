package JavaQuote;

//ʹ��this���ù��췽��
class Person3{
	private String name;
	private int age;
	public Person3(){
		System.out.println("һ���µ�Person����ʵ����");
	}
	public Person3(String name,int age){
		this();
		this.name=name;
		this.age=age;
	}
	public String getInfo(){
		return "������"+name+",���䣺"+age;
	}
}

public class ThisDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person3 per1=new Person3("����",33);
		System.out.println(per1.getInfo());

	}

}
