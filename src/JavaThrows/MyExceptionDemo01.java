package JavaThrows;


//自定义异常类
class MyException extends Exception{
	public MyException(String msg){
		super(msg);
	}
}
public class MyExceptionDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new MyException("自定义异常");
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
