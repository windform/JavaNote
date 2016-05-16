package JavaGenerics;
/*泛型*/

//坐标点设计
class Point{
	private Object x;
	private Object y;
	public void setX(Object x){
		this.x=x;
	}
	public void setY(Object y){
		this.y=y;
	}
	public Object getX(){
		return this.x;
	}
	public Object getY(){
		return this.y;
	}
}

public class GenericsDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.setX(10);   //自动装箱操作：int->Integer->Object
		p.setY(20);   //自动装箱操作
		int x=(Integer)p.getX(); //取出数据时先变为Integer，之后自动拆箱
		int y=(Integer)p.getY();
		System.out.println("X坐标为："+x);
		System.out.println("Y坐标为："+y);
		System.out.println("------------------------");
		
		Point p1=new Point();
		p1.setX(10.5f);
		p1.setY(20.6f);
		float x1=(Float)p1.getX();
		float y1=(Float)p1.getY();
		System.out.println("X1坐标为："+x1);
		System.out.println("Y1坐标为："+y1);
		System.out.println("------------------------");
		
		Point p2=new Point();
		p2.setX("东京180度");
		p2.setY("北纬60度");
		String x2=(String)p2.getX();
		String y2=(String)p2.getY();
		System.out.println("X2坐标为："+x2);
		System.out.println("Y2坐标为："+y2);
		System.out.println("------------------------");

	}

}
