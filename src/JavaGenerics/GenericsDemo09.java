package JavaGenerics;
//���޷���

//��������
//��������������<? extends ��> ��������
//�����ࣺ [��������] ������ <���ͱ�ʶ extends ��>{}

//��������
//��������������<? super ��> ��������
//�����ࣺ [��������] ������ <���ͱ�ʶ extends ��>{}


//���͵�����
class Info9<T>{
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
public class GenericsDemo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info9<Object> i7=new Info9<Object>();
		Info9<String> i8=new Info9<String>();
		i7.setVar(new Object());
		i8.setVar("����");
		fun(i7);
		fun(i8);
	}
	public static void fun(Info9<? super String> temp){   //ֻ�ܽ���String��Object���͵ķ��� 
		System.out.println(temp+",");
	}

}
