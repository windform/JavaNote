package JavaThrows;


//�Զ����쳣��
class MyException extends Exception{
	public MyException(String msg){
		super(msg);
	}
}
public class MyExceptionDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new MyException("�Զ����쳣");
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
