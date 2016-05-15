public class MethodDemo04{
	public static void main(String[] args){
		System.out.println("1、调用fun()方法之前");
		fun(1);
		System.out.println("2、调用fun()方法之后");
	}
	public static void fun(int x){
		System.out.println("3、进入fun()方法");
		if(x==10){
			return;
		}
		System.out.println("4、正常执行fun()方法");

	}
}