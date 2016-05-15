package JavaThread;
/*�̵߳����ȼ�
 * setPriority():MAX_PRIORITY��NORM_PRIORITY��MIN_PRIORITY
 * �����߳����ȼ�Խ�߾�һ������ִ�У��ĸ��߳���ִ�н���CPU�ĵ���ִ��*/

class MyThread11 implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			try{
				Thread.sleep(500);
			}catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+"����-->"+i);
		}
	}
}

public class ThreadDemo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t11=new Thread(new MyThread11(),"�߳�A");
		Thread t12=new Thread(new MyThread11(),"�߳�B");
		Thread t13=new Thread(new MyThread11(),"�߳�C");
		t11.setPriority(Thread.MIN_PRIORITY);
		t12.setPriority(Thread.MAX_PRIORITY);
		t13.setPriority(Thread.NORM_PRIORITY);
		t11.start();
		t12.start();
		t13.start();
	}

}
