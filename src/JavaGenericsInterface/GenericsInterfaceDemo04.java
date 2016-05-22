package JavaGenericsInterface;
//泛型数组

/*//class Info03<T>{
//	private T var;
//	public T getVar(){
//		return var;
//	};
//	public void setVar(T var){
//		this.var=var;
//	};
//	public String toString(){
//		return this.var.toString();
//	};
//}
*/
public class GenericsInterfaceDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i[]=fun1(1,2,3,4,5,6);
		fun2(i);
	}
	public static<T> T[] fun1(T...arg){
		return arg;
	}
	public static <T> void fun2(T param[]){
		System.out.println("接收泛型数组:");
		for(T t:param){
			System.out.print(t+"、");
		}
		System.out.println();

		
	}

}
