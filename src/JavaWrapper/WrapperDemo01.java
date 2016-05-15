package JavaWrapper;

//装箱和拆箱
public class WrapperDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//装箱及拆箱操作
		int x=30;  //声明一个基本数据类型
		Integer i=new Integer(x);   //装箱：将基本数据类型变为包装类
		int temp=i.intValue();     //拆箱：将一个包装类变为基本数据类型
		
		//浮点数装箱及拆箱
		float f = 30.3f;
		Float x1=new Float(f);  //装箱
		float y1=x1.floatValue(); //拆箱
		
		//自动装箱及拆箱操作
		Integer j=30;  //自动装箱成Integer
		Float f1=30.3f;   //自动装箱成Float
		int x2=j;       //自动拆箱成int
		float y2=f1;      //自动拆箱成float
	}

}
