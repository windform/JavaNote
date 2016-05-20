package JavaGenerics;
//通配符

//匹配任意类型的通配符

//使用泛型声明后的对象引用传递问题
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
		i.setVar("李小龙");
		fun(i);
	}
	
	//通配符？
	public static void fun(Info<?> temp){
		System.out.println("内容:"+temp);
	}

}
