package JavaObject;

/*Object��
 * Java�����е��඼��һ�������ĸ���Object��һ����ֻҪû�����Եؼ̳�һ���࣬��϶���Object�������
 * */
class Demo1{
	//����Demo1�࣬ʵ���ϼ̳���Object��
}

class Person1{
	private String name;
	private int age;
	public Person1(String name,int age){
		this.name=name;
		this.age=age;
	} 
	public String toString(){   //��д����Object���toString()����
		return "����:"+this.name+";���䣺"+this.age;
	}
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(!(obj instanceof Person1)){
			return false;
		}
		Person1 per=(Person1)obj;
		if(per.name.equals(this.name) && per.age == age){
			return true;
		}else{
			return false;
		}
	}
}

public class ObjectDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d=new Demo1();
		System.out.println("����toString()�����"+d);
		System.out.println("��toString()�����"+d.toString());
		System.out.println("============================");
		Person1 per=new Person1("����ʲ",45);
		System.out.println("������Ϣ��"+per);
		System.out.println("============================");
		Person1 per1=new Person1("���˻�",34);
		Person1 per2=new Person1("���˻�",34);
		System.out.println(per1.equals(per2)? "��ͬһ����" : "����ͬһ����");
		System.out.println(per1.equals("���ǻ�")? "��ͬһ����" : "����ͬһ����");

	}

}
