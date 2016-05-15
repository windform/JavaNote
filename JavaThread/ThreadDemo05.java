package JavaThread;

/*线程操作的相关方法*/

//取得和设置线程的名称
class MyThread5 implements Runnable{
	public void run(){
		for(int i=0;i<3;i++){
			//取得当前线程的名字
			System.out.println(Thread.currentThread().getName()+"运行，i="+i);
		}
	}
}
public class ThreadDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread5 my5=new MyThread5();
		new Thread(my5).start(); //系统自动设置线程名称
		new Thread(my5,"线程-A").start();
		new Thread(my5,"线程-B").start();
		new Thread(my5).start(); 
		new Thread(my5).start(); 

	}

}
