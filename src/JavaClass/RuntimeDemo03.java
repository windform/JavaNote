package JavaClass;
//Runtime���ʾ����ʱ�����࣬��һ����װ��JVM���̵���

//�ü��±���������5�����ʧ
public class RuntimeDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime run=Runtime.getRuntime();   //ʵ����
		Process pro = null;  //����һ��process���󣬽��������Ľ���	
		try{
			run.exec("notepad.exe");   //���ñ������򣬱�������쳣����
			
		}catch(Exception e){
			e.printStackTrace();  //��ӡ�쳣��Ϣ
		}
		
		try{
			Thread.sleep(5000);
		}catch(Exception e){
			e.printStackTrace();
		}
		pro.destroy();
	}

}
