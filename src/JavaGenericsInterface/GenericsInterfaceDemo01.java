package JavaGenericsInterface;
//泛型接口的定义
//[访问权限] interface 接口名称<泛型标识>{}

//泛型接口的实现方式

interface Info01<T>{
	public T getVar();
}

//1,在子类的定义上声明泛型类型
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

//2,直接在接口中指定具体类型
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
		Info01<String> i=new Infolmpl<String>("李小龙");
		System.out.println("内容："+i.getVar());
		
		Info01<String> i2=new Infolmpl01("李大龙");
		System.out.println("内容："+i2.getVar());

	}

}
