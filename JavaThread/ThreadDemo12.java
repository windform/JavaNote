package JavaThread;

/*�̵߳�����*/

class MyThread12 implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+"����-->"+i);
			if(i==3){
				System.out.print("�߳����ã�");
				Thread.currentThread().yield();   //�߳����õķ���
			}
		}
	}
}

public class ThreadDemo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t12=new Thread(new MyThread12(),"�߳�A");
		Thread t13=new Thread(new MyThread12(),"�߳�B");
		t12.start();
		t13.start();
	}

}
