package JavaThreadCase;
/*�����߼��������̲߳���ʵ��
 * ����ȴ��ͻ���*/

//������Ϣ��
class Info{
	private String name="whiteblue";
	private String content="Java Web developer";
	private boolean flag=false;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getContent(){
		return content;
	}
	public void setContent(String content){
		this.content=content;
	}
	
	
	public synchronized void set(String name,String content){
		if(!flag){
			try{
				super.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}	
		}
		this.setName(name);
		try{
			Thread.sleep(300);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		this.setContent(content);
		flag=false;
		super.notify();	
	}
	
	
	public synchronized void get(){
		if(flag){
			try{
				super.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}	
		}
		try{
			Thread.sleep(300);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(this.getName()+"-->"+this.getContent());
		flag=true;
		super.notify();
		
		
	}
}

//����������
class Producer implements Runnable{
	private Info info=null;
	public Producer (Info info){
		this.info=info;
	}
	public void run(){
		boolean flag=false;
		for(int i=0;i<50;i++){
			if(flag){
				this.info.set("Whiteblue", "Java Web developer");
				flag=false;
			}else{
				this.info.set("����", "ǰ�˹���ʦ");
				flag=true;
			}
		}
	}
}

//����������
class Consumer implements Runnable{
	private Info info=null;
	public Consumer(Info info){
		this.info=info;
	}
	public void run(){
		for(int i=0;i<50;i++){
			try{
				Thread.sleep(150);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			this.info.get();
		}
	}
}

public class ThreadCaseDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info i=new Info();
		Producer pro=new Producer(i);
		Consumer con=new Consumer(i);
		new Thread(pro).start();
		new Thread(con).start();

	}

}
