package JavaObject;

/*���������������͵Ķ���
 * */

//ʹ��Object���սӿ�ʵ��
interface A2{
	public String getInfo();
}
class B2 implements A2{
	public String getInfo(){
		return "Hello World";
	}
}

public class ObjectDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a=new B2();  //�ӿ�ʵ����
		Object obj=a;   //��������ת��
		A2 x = (A2)obj;  //��������ת��
		System.out.println(x.getInfo());
		
		
		//ʹ��Object��������
		int temp[]={1,3,5,7,9};
		Object obj1=temp;   //ʹ�ö������������
		print(obj1);        //������������
	}
	public static void print(Object o){
		if(o instanceof int[]){
			int x[]=(int[])o;
			for(int i=0;i<x.length;i++){
				System.out.print(x[i]+"\t");
			}
		}
	}
}
