package JavaThread;
//死锁
class Zhangsan{
	public void say(){
		System.out.println("张三对李四说：“你给我画，我就把书给你”。");
	}
	public void get(){
		System.out.println("张三得到画了。");
	}
}

class Lisi{
	public void say(){
		System.out.println("李四对张三说：“你给我书，我就把画给你”。");
	}
	public void get(){
		System.out.println("李四得到书了。");
	}
}

class ThreadDeadLock16 implements Runnable{
	private static Zhangsan zs = new Zhangsan();
	private static Lisi ls = new Lisi();
	public boolean flag=false;   //声明标记，用于判断哪个对象先执行
	public void run(){
		if(flag){
			synchronized(zs){
				zs.say();
				try{
					Thread.sleep(500);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				synchronized(ls){
					zs.get();
				}
			}
		}else{
			synchronized(ls){
				ls.say();
				try{
					Thread.sleep(500);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				synchronized(zs){
					ls.get();
				}
			} 
		}
	}
}

public class ThreadDemo16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDeadLock16 t1=new ThreadDeadLock16();
		ThreadDeadLock16 t2=new ThreadDeadLock16();
		t1.flag=true;
		t2.flag=false;
		Thread thA=new Thread(t1);
		Thread thB=new Thread(t2);
		thA.start();
		thB.start();

	}

}
