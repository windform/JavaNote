package JavaThrows;
/*Throw 关键字
 * 与throws关键字不同的是，可以直接使用throw关键字人为地抛出一个异常，抛出时直接抛出异常类的实例化对象即可
 * throw不会单独使用 */

public class ThrowDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new Exception("自己抛出异常");
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

}
