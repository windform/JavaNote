package JavaSystem;

//�������ջ���
class Person04{
	private String name;
	private int age;
	public Person04(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return "������"+this.name+",���䣺"+this.age;
	}
	public void finalize() throws Throwable{    //�����ͷſռ�ʱĬ�ϵ��ô˷���
		System.out.println("�����ͷ�-->"+this);  //ֱ�Ӵ�ӡ�������toString
	}
	
}
public class SystemDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person04 per = new Person04("����",76);
		per = null;  //�Ͽ����ã��ͷſռ�
		System.gc(); 
		
		
	}

}
