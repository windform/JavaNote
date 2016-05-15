package JavaThread;

/*线程操作范例*/


//实现方式一：继承Thread类
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
		System.out.println(Thread.currentThread().getName()+"线程，休眠 "+this.time+" 毫秒");
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
		System.out.println(this.name+"线程，休眠 "+this.time+" 毫秒");
	}
}

public class ThreadDemo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Thread t13=new MyThread13_1("线程A",10000);
		Thread t14=new MyThread13_1("线程B",20000);
		t13.start();
		t14.start();*/
		Thread t13=new Thread(new MyThread13_2("线程13",5000));
		Thread t14=new Thread(new MyThread13_2("线程14",10000));
		Thread t15=new Thread(new MyThread13_2("线程15",15000));
		t13.start();
		t14.start();
		t15.start();
	}

}
