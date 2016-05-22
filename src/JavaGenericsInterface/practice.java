package JavaGenericsInterface;

//信息接口
interface PracInfo{
	
}
//联系方式类
class Contact implements PracInfo{   //实现接口
	private String address;  //联系地址
	private String telphone;   //联系方式
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
		return "联系方式:"+"\n"+
				"\t|- 联系电话:"+this.getTelphone()+"\n"+
				"\t|- 联系地址:"+this.getAddress()+"\n"+
				"\t|- 邮政编码:"+this.getZipcode()+"\n";
	}
}

//个人信息类
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
		return "基本信息:"+"\n"+
				"\t|- 姓名:"+this.getName()+"\n"+
				"\t|- 性别:"+this.getSex()+"\n"+
				"\t|- 年龄:"+this.getAge()+"\n";
	}
	
}
//Person 类
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
		Person per1=new Person<Contact>(new Contact("北京市","010-2209674","100088"));
		System.out.println(per1);
		
		Person per2=new Person<Introduction>(new Introduction("刘德华","男",50));
		System.out.println(per2);
	}
}
