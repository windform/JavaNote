package JavaClass;
//Runtime���ʾ����ʱ�����࣬��һ����װ��JVM���̵���

//���ü������ִ�г���
public class RuntimeDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime run=Runtime.getRuntime();   //ʵ����
		try{
			run.exec("notepad.exe");   //���ñ������򣬱�������쳣����
			
		}catch(Exception e){
			e.printStackTrace();  //��ӡ�쳣��Ϣ
			
		}

		

	}

}
