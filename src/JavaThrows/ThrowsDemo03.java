package JavaThrows;

/*throw 与throws 的应用
 * */
class Math3{
	public int div(int i,int j) throws Exception{
		System.out.println("*******计算开始**********");
		int temp=0;
		try{
			temp=i/j;
		}catch(Exception e){
			throw e;
		}finally{
			System.out.println("*********计算结束*************");
		}
		return temp;
	}
}
public class ThrowsDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math3 m=new Math3();
		try{
			System.out.println("除法操作："+m.div(10, 0));
		}catch(Exception e){
			System.out.println("产生异常："+e);
		}

	}

}
