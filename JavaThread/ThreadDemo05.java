package JavaThread;

/*�̲߳�������ط���*/

//ȡ�ú������̵߳�����
class MyThread5 implements Runnable{
	public void run(){
		for(int i=0;i<3;i++){
			//ȡ�õ�ǰ�̵߳�����
			System.out.println(Thread.currentThread().getName()+"���У�i="+i);
		}
	}
}
public class ThreadDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread5 my5=new MyThread5();
		new Thread(my5).start(); //ϵͳ�Զ������߳�����
		new Thread(my5,"�߳�-A").start();
		new Thread(my5,"�߳�-B").start();
		new Thread(my5).start(); 
		new Thread(my5).start(); 

	}

}
