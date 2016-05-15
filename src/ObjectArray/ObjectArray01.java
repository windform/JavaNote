package ObjectArray;
class Person1{
	private String name;
	public Person1(String name){this.name=name;}
	public String getName(){
		return name;
	}
}

public class ObjectArray01 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Person1 per[]=new Person1[3];
		System.out.println("------------数组声明-------------");
		for(int x=0;x<per.length;x++){
			System.out.print(per[x]+"、");
		}
		per[0]=new Person1("张三");
		per[1]=new Person1("李四");
		per[2]=new Person1("王五");
		System.out.println("------------对象实例化-------------");
		for(int x=0;x<per.length;x++){
			System.out.print(per[x]+"、");
		}

	}

}
