package JavaThreadCase;
/*�̵߳���������
 * suspend():��ʱ�����߳�
 * resume():�ָ�������߳�
 * stop():ֹͣ�߳�
 * */

class MyThread2 implements Runnable{
	private boolean flag=true;   //�����־λ����
	public void run(){
		int i=0;
		while(this.flag){
			while(true){
				if(i<20){
					System.out.println(Thread.currentThread().getName()+"���У�i="+(i++));
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
		Thread t=new Thread(my,"�߳�");
		t.start();
		//my.stop();

	}

}
