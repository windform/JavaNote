package JavaThread;
//�ж��߳��Ƿ�����
class MyThread6 implements Runnable{
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println(Thread.currentThread().getName()+"����-->"+i);
		}
	}
}

public class ThreadDemo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread6 mt6=new MyThread6();
		Thread t6=new Thread(mt6,"�߳�");
		System.out.println("�߳̿�ʼ֮ǰ-->"+t6.isAlive());
		t6.start();
		System.out.println("�߳̿�ʼ֮��-->"+t6.isAlive());
		for(int i=0;i<3;i++){
			System.out.println("main ����-->"+i);
		}
		System.out.println("����ִ��֮��-->"+t6.isAlive());
		

	}

}
