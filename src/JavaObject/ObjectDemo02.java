package JavaObject;

/*接收任意引用类型的对象
 * */

//使用Object接收接口实例
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
		A2 a=new B2();  //接口实例化
		Object obj=a;   //对象向上转型
		A2 x = (A2)obj;  //对象向下转型
		System.out.println(x.getInfo());
		
		
		//使用Object接收数组
		int temp[]={1,3,5,7,9};
		Object obj1=temp;   //使用对象类接收数组
		print(obj1);        //传递数组引用
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
