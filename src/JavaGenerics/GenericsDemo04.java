package JavaGenerics;
/*泛型应用中的构造方法*/

class Point4<T>{			//此处可以是任意的标识符号，T是type的简称
	private T x;			//此变量的类型由外部决定
	private T y;
	public Point4(T x,T y){
		this.x=x;
		this.y=y;
	}
	public T getX(){		//返回值的类型由外部决定
		return x;
	}
	public void setX(T x){		//设置的类型由外部指定
		this.x=x;
	}
	public T getY(){
		return y;
	}
	public void setY(T y){
		this.y = y;
	}
}

public class GenericsDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point4<String> p4=new Point4<String>("谷歌","伟大");
		System.out.println("泛型构造方法实例化："+p4.getX()+","+p4.getY());
		

	}

}
