package JavaThread;
/*
 * Thread���е�run()�������õ���Runnable�ӿ��е�run()������Ҳ����˵�˷�����Runnable������ɵ�
 * ���������Ҫͨ���̳�Thread()��ʵ�ֶ��̣߳�����븲дrun()����
 * ���һ����̳�Thread�࣬���ʺ��ڶ���̹߳�����Դ����ʵ����Runnable�ӿڣ��Ϳ��Է����ʵ����Դ����*/

//ʵ��Runnable�ӿڿ�����Դ����
class MyThread4 implements Runnable{   
	private int ticket=5;
	public void run(){
		for(int i=0;i<100;i++){
			if(ticket>0){
				System.out.println("��Ʊ��ticket="+ticket--);
			}
		}
	}
}
public class ThreadDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread4 x1=new MyThread4();
		new Thread(x1).start();
		new Thread(x1).start();
	}

}
