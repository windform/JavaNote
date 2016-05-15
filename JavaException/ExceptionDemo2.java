package JavaException;

/*异常的基本概念
 * 
 * try{
 *有可能出现异常的语句
 *}catch(异常类 异常对象){
 *编写异常的处理语句
 *}*/

//捕捉多个异常
public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*********计算开始***********");
		int i=0;
		int j=0;
		try{
		String str1=args[0];
		String str2=args[1];
		i=Integer.parseInt(str1);
		j=Integer.parseInt(str2);
		int temp=i/j;
		System.out.println("两个数字相除的结果："+temp);
		}catch(ArithmeticException e){       //捕捉算数异常
			System.out.println("出现了异常："+e);   //处理算数异常
		}catch(NumberFormatException e){
			System.out.println("数字转化异常："+e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组越界异常："+ e);
		}
		System.out.println("**********计算结束******************");
	}

}
