package JavaThread;

/*�̲߳�������*/


//ʵ�ַ�ʽһ���̳�Thread��
class MyThread13_1 extends Thread{
	private int time;
	public MyThread13_1(String name,int time){
		super(name);
		this.time=time;
	}
	public void run(){
		try{
			Thread.sleep(this.time);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"�̣߳����� "+this.time+" ����");
	}
}


class MyThread13_2 implements Runnable{
	private String name;
	private int time;
	public MyThread13_2(String name,int time){
		this.name=name;
		this.time=time;
	}
	public void run(){
		try{
			Thread.sleep(this.time);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(this.name+"�̣߳����� "+this.time+" ����");
	}
}

public class ThreadDemo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Thread t13=new MyThread13_1("�߳�A",10000);
		Thread t14=new MyThread13_1("�߳�B",20000);
		t13.start();
		t14.start();*/
		Thread t13=new Thread(new MyThread13_2("�߳�13",5000));
		Thread t14=new Thread(new MyThread13_2("�߳�14",10000));
		Thread t15=new Thread(new MyThread13_2("�߳�15",15000));
		t13.start();
		t14.start();
		t15.start();
	}

}
