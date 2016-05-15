package JavaThread;
/*在Java中要想实现多线程操作有两种手段，一种是继承Thread类，另一种就是实现Runnable接口*/


//继承Thread类实现多线程
class MyThread extends Thread{   //继承Thread类
	private String name;
	public MyThread(String name){
		this.name=name;
	}
	public void run(){  //覆写Thread类中的run()方法
		for(int i=0;i<10;i++){
			System.out.println(name+"运行，i="+i);
		}
		
	}
	
}
public class ThreadDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m1=new MyThread("线程A");
		MyThread m2=new MyThread("线程B");
		m1.start();
		//m1.start();
		m2.start();
		
		//一个实例化对象如果重复调用start()方法，会报错

	}

}
