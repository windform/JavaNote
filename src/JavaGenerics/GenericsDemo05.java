package JavaGenerics;
/*ָ�������������
 * �ڷ���Ӧ������������������ʱָ�������ڲ����������ͣ�����ͻ���ֲ���ȫ�����ľ�����Ϣ*/

class Notepad<K,V>{			//�˴�����������ı�ʶ���ţ�T��type�ļ��
	private K key;			//�˱������������ⲿ����
	private V value;
	public K getKey(){
		return key;
	}
	public void setKey(K key){		//���õ��������ⲿָ��
		this.key=key;
	}
	public V getValue(){
		return value;
	}
	public void setValue(V value){
		this.value = value;
	}
}

public class GenericsDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notepad<String,Integer> t=new Notepad<String,Integer>();
		t.setKey("΢��");
		t.setValue(90);
		System.out.println("��˾��"+t.getKey());
		System.out.println("����:"+t.getValue());

		

	}

}
