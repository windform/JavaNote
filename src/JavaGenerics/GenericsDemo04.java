package JavaGenerics;
/*����Ӧ���еĹ��췽��*/

class Point4<T>{			//�˴�����������ı�ʶ���ţ�T��type�ļ��
	private T x;			//�˱������������ⲿ����
	private T y;
	public Point4(T x,T y){
		this.x=x;
		this.y=y;
	}
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

public class GenericsDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point4<String> p4=new Point4<String>("�ȸ�","ΰ��");
		System.out.println("���͹��췽��ʵ������"+p4.getX()+","+p4.getY());
		

	}

}
