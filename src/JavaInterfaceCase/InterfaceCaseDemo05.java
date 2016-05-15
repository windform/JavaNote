package JavaInterfaceCase;

//���ģʽ�����������
interface Fruit{
	public void eat();
}
class Apple implements Fruit{
	public void eat(){
		System.out.println("��ƻ��");
	}
}
class Orange implements Fruit{
	public void eat(){
		System.out.println("������");
	}
}

//��������
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
