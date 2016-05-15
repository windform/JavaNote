package JavaThread;
/*在程序中允许一个线程进行暂时休眠，直接使用Thread.sleep()方法即可实现休眠
 * */
class MyThread8 implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+"运行-->"+i);
		}
	}
}

public class ThreadDemo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread8 mt8=new MyThread8();
		Thread t8=new Thread(mt8,"线程");
		t8.start();


	}

}
