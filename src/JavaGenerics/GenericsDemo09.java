package JavaGenerics;
//受限泛型

//设置上限
//声明对象：类名称<? extends 类> 对象名称
//定义类： [访问类型] 类名称 <泛型标识 extends 类>{}

//设置下限
//声明对象：类名称<? super 类> 对象名称
//定义类： [访问类型] 类名称 <泛型标识 extends 类>{}


//泛型的下限
class Info9<T>{
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
public class GenericsDemo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info9<Object> i7=new Info9<Object>();
		Info9<String> i8=new Info9<String>();
		i7.setVar(new Object());
		i8.setVar("李潇");
		fun(i7);
		fun(i8);
	}
	public static void fun(Info9<? super String> temp){   //只能接收String或Object类型的泛型 
		System.out.println(temp+",");
	}

}
