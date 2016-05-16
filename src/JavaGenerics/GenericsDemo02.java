package JavaGenerics;
/*泛型
 * 泛型可以解决数据类型的安全性问题，其主要原理是在类声明时通过一个标识表示类中某个属性的类型或者是某个方法的返回值及参数类型
 * 这样在类声明或实例化时只要指定好需要的具体的类型即可*/

//声明泛型
class Point2<T>{			//此处可以是任意的标识符号，T是type的简称
	private T var;			//此变量的类型由外部决定
	public T getVar(){		//返回值的类型由外部决定
		return var;
	}
	public void setVar(T var){		//设置的类型由外部指定
		this.var=var;
	}
}

public class GenericsDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用Point类将var的类型设置成整数
		Point2<Integer> p2=new Point2<Integer>();
		p2.setVar(30);
		System.out.println(p2.getVar()*3);
		
		//使用Point类将var的类型设置成String类型
		Point2<String> p3=new Point2<String>();
		p3.setVar("蓝白");
		System.out.println(p3.getVar().length());  

	}

}
