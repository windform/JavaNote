package JavaThread;
/*中断线程
 *当一个线程运行时，另外一个线程可以直接通过interrupt()方法中断其运行状态*/
class MyThread9 implements Runnable{
	public void run(){
		System.out.println("1、进入run()方法");
		try{
			Thread.sleep(10000);
			System.out.println("2、已经完成休眠");
		}catch(Exception e){
			System.out.println("3、休眠被终止");
			return;
		}
		System.out.println("4、run方法正常结束");
	}
}

public class ThreadDemo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread9 mt9=new MyThread9();
		Thread t9=new Thread(mt9,"线程");
		t9.start();
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			
		}
		t9.interrupt();


	}

}
