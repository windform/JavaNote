package JavaThread;
/*
 * Thread���е�run()�������õ���Runnable�ӿ��е�run()������Ҳ����˵�˷�����Runnable������ɵ�
 * ���������Ҫͨ���̳�Thread()��ʵ�ֶ��̣߳�����븲дrun()����
 * ���һ����̳�Thread�࣬���ʺ��ڶ���̹߳�����Դ����ʵ����Runnable�ӿڣ��Ϳ��Է����ʵ����Դ����*/

//�̳�Thread�಻����Դ����
class MyThread3 extends Thread{   
	private int ticket=5;
	public void run(){
		for(int i=0;i<100;i++){
			if(ticket>0){
				System.out.println("��Ʊ��ticket="+ticket--);
			}
		}
	}
}
public class ThreadDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 x1=new MyThread3();
		MyThread3 x2=new MyThread3();
		MyThread3 x3=new MyThread3();
		x1.start();
		x2.start();
		x3.start();
	}

}
