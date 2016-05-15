package JavaThread;
//判断线程是否启动
class MyThread6 implements Runnable{
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println(Thread.currentThread().getName()+"运行-->"+i);
		}
	}
}

public class ThreadDemo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread6 mt6=new MyThread6();
		Thread t6=new Thread(mt6,"线程");
		System.out.println("线程开始之前-->"+t6.isAlive());
		t6.start();
		System.out.println("线程开始之后-->"+t6.isAlive());
		for(int i=0;i<3;i++){
			System.out.println("main 运行-->"+i);
		}
		System.out.println("代码执行之后-->"+t6.isAlive());
		

	}

}
