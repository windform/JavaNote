package JavaGenerics;
//���޷���

//��������
//��������������<? extends ��> ��������
//�����ࣺ [��������] ������ <���ͱ�ʶ extends ��>{}

//��������
//��������������<? super ��> ��������
//�����ࣺ [��������] ������ <���ͱ�ʶ extends ��>{}


//��������
class Info7<T extends Number>{
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
public class GenericsDemo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info7<Integer> i7=new Info7<Integer>();
		Info7<Float> i8=new Info7<Float>();
		i7.setVar(90);
		i8.setVar(98.65f);
		fun(i7);
		fun(i8);
	}
	public static void fun(Info7<? extends Number> temp){
		System.out.println(temp+",");
	}

}
