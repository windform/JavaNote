package JavaThread;
/*后台线程*/
class MyThread10 implements Runnable{
	public void run(){
		while(true){
			System.out.println(Thread.currentThread().getName()+"正在运行");
		}

	}
}

public class ThreadDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread10 mt10=new MyThread10();
		Thread t10=new Thread(mt10,"线程");
		t10.setDaemon(true);   //此程序在后台运行
		t10.start();
		
	}

}
