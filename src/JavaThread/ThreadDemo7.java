package JavaThread;
/*���̲߳����У�����ʹ��join()������һ���߳�ǿ�����У��߳�ǿ�������ڼ䣬���������޷����У�����ȴ�
 * ���߳����֮��ſ��Լ�������
 * */
class MyThread7 implements Runnable{
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println(Thread.currentThread().getName()+"����-->"+i);
		}
	}
}

public class ThreadDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread7 mt7=new MyThread7();
		Thread t7=new Thread(mt7,"�߳�");
		t7.start();
		for(int i=0;i<50;i++){
			if(i>10){
				try{
					t7.join();
				}catch(Exception e){}
			}
			System.out.println("main ����-->"+i);
		}

	}

}
