package JavaGenerics;
/*����*/

//��������
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
		p.setX(10);   //�Զ�װ�������int->Integer->Object
		p.setY(20);   //�Զ�װ�����
		int x=(Integer)p.getX(); //ȡ������ʱ�ȱ�ΪInteger��֮���Զ�����
		int y=(Integer)p.getY();
		System.out.println("X����Ϊ��"+x);
		System.out.println("Y����Ϊ��"+y);
		System.out.println("------------------------");
		
		Point p1=new Point();
		p1.setX(10.5f);
		p1.setY(20.6f);
		float x1=(Float)p1.getX();
		float y1=(Float)p1.getY();
		System.out.println("X1����Ϊ��"+x1);
		System.out.println("Y1����Ϊ��"+y1);
		System.out.println("------------------------");
		
		Point p2=new Point();
		p2.setX("����180��");
		p2.setY("��γ60��");
		String x2=(String)p2.getX();
		String y2=(String)p2.getY();
		System.out.println("X2����Ϊ��"+x2);
		System.out.println("Y2����Ϊ��"+y2);
		System.out.println("------------------------");

	}

}
