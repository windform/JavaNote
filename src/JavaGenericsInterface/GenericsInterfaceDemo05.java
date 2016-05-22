package JavaGenericsInterface;
//泛型的嵌套设置
class Info05<T,V>{
	private T var;
	private V value;
	public Info05(T var,V value){
		this.setVar(var);
		this.setValue(value);
	}
	public T getVar(){
		return var;
	}
	public V getValue(){
		return value;
	}
	public void setVar(T var){
		this.var=var;
	}
	public void setValue(V value){
		this.value=value;
	}
}

class Demo<S>{
	private S info;
	public Demo(S info){
		this.setInfo(info);
	}
	public S getInfo(){
		return info;
	}
	public void setInfo(S info){
		this.info=info;
	}
}



public class GenericsInterfaceDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo<Info05<String,Integer>> d = null;
		Info05<String,Integer> i = new Info05<String,Integer>("张无忌",28);
		d=new Demo<Info05<String,Integer>>(i);
		System.out.println("内容一："+d.getInfo().getVar());
		System.out.println("内容二："+d.getInfo().getValue());
		
	}
}
