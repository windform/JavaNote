package JavaGenerics;
/*����
 * ���뷺�͵����ô��Ǳ�������ת���쳣�ķ�����������ʹ����Ĳ������Ӱ�ȫ*/

//ʹ�÷����޸Ĵ���
class Point3<T>{			//�˴�����������ı�ʶ���ţ�T��type�ļ��
	private T x;			//�˱������������ⲿ����
	private T y;
	public T getX(){		//����ֵ���������ⲿ����
		return x;
	}
	public void setX(T x){		//���õ��������ⲿָ��
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
		System.out.println("����ֵ��"+x+","+y);
		

	}

}
