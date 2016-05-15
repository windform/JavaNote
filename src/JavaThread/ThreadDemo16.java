package JavaThread;
//����
class Zhangsan{
	public void say(){
		System.out.println("����������˵��������һ����ҾͰ�����㡱��");
	}
	public void get(){
		System.out.println("�����õ����ˡ�");
	}
}

class Lisi{
	public void say(){
		System.out.println("���Ķ�����˵����������飬�ҾͰѻ����㡱��");
	}
	public void get(){
		System.out.println("���ĵõ����ˡ�");
	}
}

class ThreadDeadLock16 implements Runnable{
	private static Zhangsan zs = new Zhangsan();
	private static Lisi ls = new Lisi();
	public boolean flag=false;   //������ǣ������ж��ĸ�������ִ��
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
