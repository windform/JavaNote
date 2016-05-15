package JavaThreadCase;
/*线程的生命周期
 * suspend():暂时挂起线程
 * resume():恢复挂起的线程
 * stop():停止线程
 * */

class MyThread2 implements Runnable{
	private boolean flag=true;   //定义标志位属性
	public void run(){
		int i=0;
		while(this.flag){
			while(true){
				if(i<20){
					System.out.println(Thread.currentThread().getName()+"运行，i="+(i++));
				}else{
					this.stop();
				}	
			}
		}
	}
	public void stop(){
		this.flag=false;
	}
}

public class ThreadCaseDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 my=new MyThread2();
		Thread t=new Thread(my,"线程");
		t.start();
		//my.stop();

	}

}
