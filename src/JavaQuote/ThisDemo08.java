package JavaQuote;
//this表示当前对象
class Person8{
	private String name;
	private int age;
	public Person8(String name,int age){
		this.setName(name);
		this.setAge(age);
	}
	public boolean compare(Person8 per){
		Person8 p1=this;
		Person8 p2=per;
		if(p1==p2){return true;}
		if(p1.name.equals(p2.name) && p1.age==p2.age){
			return true;
		}else{
			return false;
		}
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name=n;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int a){
		age=a;
	}
}

public class ThisDemo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person8 per1=new Person8("李四",27);
		Person8 per2=new Person8("李四",27);
		if(per1.compare(per2)){
			System.out.println("两个对象相等");
		}else{
			System.out.print("两个对象不相等");
		}

	}

}
