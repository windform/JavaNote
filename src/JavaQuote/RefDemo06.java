package JavaQuote;

//ʹ��this���ñ����е�����
class Person1{
	private String name;
	private int age;
	public Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getInfo(){
		return "������"+name+",���䣺"+age;
	}
}

public class RefDemo06 {
	public static void main(String[] args){
		Person1 per1=new Person1("����",33);
		System.out.println(per1.getInfo());
	}

}
