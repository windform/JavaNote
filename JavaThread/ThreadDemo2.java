package JavaThread;
/*在Java中要想实现多线程操作有两种手段，一种是继承Thread类，另一种就是实现Runnable接口*/


//实现Runnable接口
class MyThread2 implements Runnable{   //实现Runnable接口
	private String name;
	public MyThread2(String name){
		this.name=name;
	}
	public void run(){  //覆写Runnable中的run()方法
		for(int i=0;i<10;i++){
			System.out.println(name+"运行，i="+i);
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 my1=new MyThread2("线程A");   //实现Runnable子类对象
		MyThread2 my2=new MyThread2("线程B");	//实现Runnable子类对象
		Thread t1= new Thread(my1);
		Thread t2= new Thread(my2);
		t1.start();
		//m1.start();
		t2.start();
		
		//无论是使用哪种方式，最终都必须依靠Thread类才能启动多线程

	}

}
