package JavaGenericsInterface;
//使用泛型统一传入的参数类型

class Info03<T>{
	private T var;
	public T getVar(){
		return var;
	};
	public void setVar(T var){
		this.var=var;
	};
	public String toString(){
		return this.var.toString();
	};
}

public class GenericsInterfaceDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info03<String> i1=new Info03<String>();
		Info03<String> i2=new Info03<String>();
		i1.setVar("Hello");
		i2.setVar("Java");
		add(i1,i2);
		


	}
	public static <T> void add(Info03<T>i1,Info03<T>i2){
		System.out.println(i1.getVar()+" "+i2.getVar());

		
	}

}
