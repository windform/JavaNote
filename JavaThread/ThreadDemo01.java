package JavaThread;
/*��Java��Ҫ��ʵ�ֶ��̲߳����������ֶΣ�һ���Ǽ̳�Thread�࣬��һ�־���ʵ��Runnable�ӿ�*/


//�̳�Thread��ʵ�ֶ��߳�
class MyThread extends Thread{   //�̳�Thread��
	private String name;
	public MyThread(String name){
		this.name=name;
	}
	public void run(){  //��дThread���е�run()����
		for(int i=0;i<10;i++){
			System.out.println(name+"���У�i="+i);
		}
		
	}
	
}
public class ThreadDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m1=new MyThread("�߳�A");
		MyThread m2=new MyThread("�߳�B");
		m1.start();
		//m1.start();
		m2.start();
		
		//һ��ʵ������������ظ�����start()�������ᱨ��

	}

}
