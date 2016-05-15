package JavaThread;
/*在线程操作中，可以使用join()方法让一个线程强制运行，线程强制运行期间，其他程序无法运行，必须等待
 * 此线程完成之后才可以继续操作
 * */
class MyThread7 implements Runnable{
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println(Thread.currentThread().getName()+"运行-->"+i);
		}
	}
}

public class ThreadDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread7 mt7=new MyThread7();
		Thread t7=new Thread(mt7,"线程");
		t7.start();
		for(int i=0;i<50;i++){
			if(i>10){
				try{
					t7.join();
				}catch(Exception e){}
			}
			System.out.println("main 运行-->"+i);
		}

	}

}
