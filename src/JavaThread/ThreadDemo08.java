package JavaThread;
/*�ڳ���������һ���߳̽�����ʱ���ߣ�ֱ��ʹ��Thread.sleep()��������ʵ������
 * */
class MyThread8 implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+"����-->"+i);
		}
	}
}

public class ThreadDemo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread8 mt8=new MyThread8();
		Thread t8=new Thread(mt8,"�߳�");
		t8.start();


	}

}
