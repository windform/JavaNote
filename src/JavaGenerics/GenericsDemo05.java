package JavaGenerics;
/*指定多个泛型类型
 * 在泛型应用中最好在声明类对象时指定好其内部的数据类型，否则就会出现不安全操作的警告信息*/

class Notepad<K,V>{			//此处可以是任意的标识符号，T是type的简称
	private K key;			//此变量的类型由外部决定
	private V value;
	public K getKey(){
		return key;
	}
	public void setKey(K key){		//设置的类型由外部指定
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
		t.setKey("微软");
		t.setValue(90);
		System.out.println("公司："+t.getKey());
		System.out.println("年龄:"+t.getValue());

		

	}

}
