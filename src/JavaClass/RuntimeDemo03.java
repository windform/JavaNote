package JavaClass;
//Runtime类表示运行时操作类，是一个封装了JVM进程的类

//让记事本进程运行5秒后消失
public class RuntimeDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime run=Runtime.getRuntime();   //实例化
		Process pro = null;  //声明一个process对象，接收启动的进程	
		try{
			run.exec("notepad.exe");   //调用本机程序，必须进行异常处理
			
		}catch(Exception e){
			e.printStackTrace();  //打印异常信息
		}
		
		try{
			Thread.sleep(5000);
		}catch(Exception e){
			e.printStackTrace();
		}
		pro.destroy();
	}

}
