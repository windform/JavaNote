package ObjectArray;
class Person2{
	private String name;
	public Person2(String name){this.name=name;}
	public String getName(){
		return name;
	}
}

public class ObjectArray02 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		//��̬ʵ����
		Person2 per[]={new Person2("����"),new Person2("����"),new Person2("����")};
		for(int x=0;x<per.length;x++){
			System.out.print(per[x].getName()+"��");
		}

	}

}
