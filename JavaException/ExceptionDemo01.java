package JavaException;

/*异常的基本概念
 * 
 * try{
 *有可能出现异常的语句
 *}catch(异常类 异常对象){
 *编写异常的处理语句
 *}*/

//对异常进行捕捉
public class ExceptionDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*********计算开始***********");
		int i=10;
		int j=0;
		try{
		int temp=i/j;     //此处产生异常
		System.out.println("两个数字相除的结果："+temp);
		}catch(ArithmeticException e){
			System.out.println("出现了异常："+e);
		}finally{
			System.out.println("不管是否出现异常，都执行此代码");
		}
		System.out.println("**********计算结束******************");
	}

}
