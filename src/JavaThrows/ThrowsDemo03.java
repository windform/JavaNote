package JavaThrows;

/*throw ��throws ��Ӧ��
 * */
class Math3{
	public int div(int i,int j) throws Exception{
		System.out.println("*******���㿪ʼ**********");
		int temp=0;
		try{
			temp=i/j;
		}catch(Exception e){
			throw e;
		}finally{
			System.out.println("*********�������*************");
		}
		return temp;
	}
}
public class ThrowsDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math3 m=new Math3();
		try{
			System.out.println("����������"+m.div(10, 0));
		}catch(Exception e){
			System.out.println("�����쳣��"+e);
		}

	}

}
