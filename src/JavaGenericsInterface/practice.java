package JavaGenericsInterface;

//��Ϣ�ӿ�
interface PracInfo{
	
}
//��ϵ��ʽ��
class Contact implements PracInfo{   //ʵ�ֽӿ�
	private String address;  //��ϵ��ַ
	private String telphone;   //��ϵ��ʽ
	private String zipcode;
	public Contact(String address,String telphone,String zipcode){
		this.setAddress(address);
		this.setTelphone(telphone);
		this.setZipcode(zipcode);
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getTelphone(){
		return telphone;
	}
	public void setTelphone(String telphone){
		this.telphone=telphone;
	}
	public String getZipcode(){
		return zipcode;
	}
	public void setZipcode(String zipcode){
		this.zipcode=zipcode;
	}
	public String toString(){
		return "��ϵ��ʽ:"+"\n"+
				"\t|- ��ϵ�绰:"+this.getTelphone()+"\n"+
				"\t|- ��ϵ��ַ:"+this.getAddress()+"\n"+
				"\t|- ��������:"+this.getZipcode()+"\n";
	}
}

//������Ϣ��
class Introduction implements PracInfo{
	private String name;
	private String sex;
	private int age;
	public Introduction(String name,String sex,int age){
		this.setName(name);
		this.setSex(sex);
		this.setAge(age);
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String toString(){
		return "������Ϣ:"+"\n"+
				"\t|- ����:"+this.getName()+"\n"+
				"\t|- �Ա�:"+this.getSex()+"\n"+
				"\t|- ����:"+this.getAge()+"\n";
	}
	
}
//Person ��
class Person<T extends PracInfo>{
	private  T info;
	public Person(T info){
		this.setInfo(info);
	}
	public T getInfo(){
		return info;
	}
	public void setInfo(T info){
		this.info=info;
	}
	public String toString(){
		return this.info.toString();
	}
}
public class practice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per1=new Person<Contact>(new Contact("������","010-2209674","100088"));
		System.out.println(per1);
		
		Person per2=new Person<Introduction>(new Introduction("���»�","��",50));
		System.out.println(per2);
	}
}
