package JavaThread;
/*��̨�߳�*/
class MyThread10 implements Runnable{
	public void run(){
		while(true){
			System.out.println(Thread.currentThread().getName()+"��������");
		}

	}
}

public class ThreadDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread10 mt10=new MyThread10();
		Thread t10=new Thread(mt10,"�߳�");
		t10.setDaemon(true);   //�˳����ں�̨����
		t10.start();
		
	}

}
