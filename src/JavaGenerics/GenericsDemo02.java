package JavaGenerics;
/*����
 * ���Ϳ��Խ���������͵İ�ȫ�����⣬����Ҫԭ������������ʱͨ��һ����ʶ��ʾ����ĳ�����Ե����ͻ�����ĳ�������ķ���ֵ����������
 * ��������������ʵ����ʱֻҪָ������Ҫ�ľ�������ͼ���*/

//��������
class Point2<T>{			//�˴�����������ı�ʶ���ţ�T��type�ļ��
	private T var;			//�˱������������ⲿ����
	public T getVar(){		//����ֵ���������ⲿ����
		return var;
	}
	public void setVar(T var){		//���õ��������ⲿָ��
		this.var=var;
	}
}

public class GenericsDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʹ��Point�ཫvar���������ó�����
		Point2<Integer> p2=new Point2<Integer>();
		p2.setVar(30);
		System.out.println(p2.getVar()*3);
		
		//ʹ��Point�ཫvar���������ó�String����
		Point2<String> p3=new Point2<String>();
		p3.setVar("����");
		System.out.println(p3.getVar().length());  

	}

}
