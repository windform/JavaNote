package JavaThread;
/*�ж��߳�
 *��һ���߳�����ʱ������һ���߳̿���ֱ��ͨ��interrupt()�����ж�������״̬*/
class MyThread9 implements Runnable{
	public void run(){
		System.out.println("1������run()����");
		try{
			Thread.sleep(10000);
			System.out.println("2���Ѿ��������");
		}catch(Exception e){
			System.out.println("3�����߱���ֹ");
			return;
		}
		System.out.println("4��run������������");
	}
}

public class ThreadDemo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread9 mt9=new MyThread9();
		Thread t9=new Thread(mt9,"�߳�");
		t9.start();
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			
		}
		t9.interrupt();


	}

}
