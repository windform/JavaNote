package JavaGenericsInterface;
//通过泛型方法返回泛型类实例

class Info02<T extends Number>{
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

public class GenericsInterfaceDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info02<Integer> i=fun(38);
		System.out.println(i.getVar());
		


	}
	public static <T extends Number> Info02<T>fun(T param){
		Info02<T>temp=new Info02<T>();
		temp.setVar(param);
		return temp;
		
	}

}
