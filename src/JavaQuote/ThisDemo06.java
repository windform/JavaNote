package JavaQuote;
class Person6{
	public String getInfo(){
		System.out.println("Person6-->"+this);
		return null;
	}
}

public class ThisDemo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person6 per1=new Person6();
		Person6 per2=new Person6();
		System.out.println("MAIN方法-->"+per1);
		per1.getInfo();
		System.out.println("-------------------");
		System.out.println("MAIN方法-->"+per2);
		per2.getInfo();

	}

}
