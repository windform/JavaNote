package JavaQuote;

class Person{
	private String name;
	private int age;
	private Book book;
	private Person child;
	public Person(String name,int age){
		this.setName(name);
		this.setAge(age);
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
	public Book getBook(){
		return book;
	}
	public void setBook(Book b){
		book=b;
	}
	public Person getChild(){
		return child;
	}
	public void setChild(Person child){
		this.child=child;
	}
}

class Book{
	private String title;
	private float price;
	private Person person;
	public Book(String title,float price){
		this.setTitle(title);
		this.setPrice(price);
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String t){
		title=t;
	}
	public float getPrice(){
		return price;
	}
	public void setPrice(float p){
		price=p;
	}
	public Person getPerson(){
		return person;
	}
	public void setPerson(Person person){
		this.person=person;
	}
}

public class RefDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per=new Person("张三",30);
		Person cld=new Person("张草",10);
		Book bk=new Book("JAVA SE 核心开发",90.0f);
		Book b=new Book("一千零一夜",30.3f);
		per.setBook(bk);
		bk.setPerson(per);
		cld.setBook(b);
		b.setPerson(cld);
		per.setChild(cld);
		System.out.println("从人找到书-->姓名："+per.getName()+";年龄："+per.getAge()+";书名："+per.getBook().getTitle()+";价格："+per.getBook().getPrice());
		System.out.println("从书找到人-->书名："+per.getBook().getTitle()+";价格："+per.getBook().getPrice()+";姓名："+per.getName()+";年龄："+per.getAge());
		System.out.println(per.getName()+"的孩子-->姓名:"+per.getChild().getName()+";年龄："+per.getChild().getAge()+";书名："+per.getChild().getBook().getTitle()+";价格："+per.getChild().getBook().getPrice());
		

	}

}
