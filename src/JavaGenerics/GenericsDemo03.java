package JavaGenerics;
/*泛型
 * 加入泛型的最大好处是避免了类转换异常的发生，这样将使程序的操作更加安全*/

//使用泛型修改代码
class Point3<T>{			//此处可以是任意的标识符号，T是type的简称
	private T x;			//此变量的类型由外部决定
	private T y;
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

public class GenericsDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3<Integer> p3=new Point3<Integer>();
		p3.setX(10);
		p3.setY(30);
		int x=p3.getX();
		int y=p3.getY();
		System.out.println("坐标值："+x+","+y);
		

	}

}
