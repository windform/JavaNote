package JavaGenerics;
//ͨ���

//ƥ���������͵�ͨ���

//ʹ�÷���������Ķ������ô�������
class Info<T>{
	private T var;
	public T getVar(){
		return var;
	}
	public void setVar(T var){
		this.var=var;
	}
	public String toString(){
		return this.var.toString();
	}
}
public class GenericsDemo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info<String> i=new Info<String>();
		i.setVar("��С��");
		fun(i);
	}
	
	//ͨ�����
	public static void fun(Info<?> temp){
		System.out.println("����:"+temp);
	}

}
