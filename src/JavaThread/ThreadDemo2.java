package JavaThread;
/*��Java��Ҫ��ʵ�ֶ��̲߳����������ֶΣ�һ���Ǽ̳�Thread�࣬��һ�־���ʵ��Runnable�ӿ�*/


//ʵ��Runnable�ӿ�
class MyThread2 implements Runnable{   //ʵ��Runnable�ӿ�
	private String name;
	public MyThread2(String name){
		this.name=name;
	}
	public void run(){  //��дRunnable�е�run()����
		for(int i=0;i<10;i++){
			System.out.println(name+"���У�i="+i);
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 my1=new MyThread2("�߳�A");   //ʵ��Runnable�������
		MyThread2 my2=new MyThread2("�߳�B");	//ʵ��Runnable�������
		Thread t1= new Thread(my1);
		Thread t2= new Thread(my2);
		t1.start();
		//m1.start();
		t2.start();
		
		//������ʹ�����ַ�ʽ�����ն���������Thread������������߳�

	}

}
