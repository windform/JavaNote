package JavaGenericsInterface;
//���ͽӿڵĶ���
//[����Ȩ��] interface �ӿ�����<���ͱ�ʶ>{}

//���ͽӿڵ�ʵ�ַ�ʽ

interface Info01<T>{
	public T getVar();
}

//1,������Ķ�����������������
class Infolmpl<T> implements Info01<T>{
	private T var;
	public Infolmpl(T var){
		this.setVar(var);
	}
	public  void setVar(T var){
		this.var=var;
	}
	public T getVar(){
		return this.var;
	}
}

//2,ֱ���ڽӿ���ָ����������
class Infolmpl01 implements Info01<String>{
	private String var;
	public Infolmpl01(String var){
		this.setVar(var);
	}
	public  void setVar(String var){
		this.var=var;
	}
	public String getVar(){
		return this.var;
	}
}

public class GenericsInterfaceDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info01<String> i=new Infolmpl<String>("��С��");
		System.out.println("���ݣ�"+i.getVar());
		
		Info01<String> i2=new Infolmpl01("�����");
		System.out.println("���ݣ�"+i2.getVar());

	}

}
