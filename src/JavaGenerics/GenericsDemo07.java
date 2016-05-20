package JavaGenerics;
//受限泛型

//设置上限
//声明对象：类名称<? extends 类> 对象名称
//定义类： [访问类型] 类名称 <泛型标识 extends 类>{}

//设置下限
//声明对象：类名称<? super 类> 对象名称
//定义类： [访问类型] 类名称 <泛型标识 extends 类>{}


//定义上限
class Info7<T extends Number>{
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
public class GenericsDemo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info7<Integer> i7=new Info7<Integer>();
		Info7<Float> i8=new Info7<Float>();
		i7.setVar(90);
		i8.setVar(98.65f);
		fun(i7);
		fun(i8);
	}
	public static void fun(Info7<? extends Number> temp){
		System.out.println(temp+",");
	}

}
