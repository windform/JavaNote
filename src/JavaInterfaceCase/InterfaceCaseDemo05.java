package JavaInterfaceCase;

//设计模式——工厂设计
interface Fruit{
	public void eat();
}
class Apple implements Fruit{
	public void eat(){
		System.out.println("吃苹果");
	}
}
class Orange implements Fruit{
	public void eat(){
		System.out.println("吃橘子");
	}
}

//工厂函数
class Factory{
	public static Fruit getInterface(String className){
		Fruit f=null;
		if("apple".equals(className)){
			f = new Apple();
		}else if("orange".equals(className)){
			f = new Orange();
		}
		return f;
	}
}
public class InterfaceCaseDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f=Factory.getInterface("apple");
		f.eat();

	}

}
