package JavaClass;
//Runtime类表示运行时操作类，是一个封装了JVM进程的类

//调用计算机可执行程序
public class RuntimeDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime run=Runtime.getRuntime();   //实例化
		try{
			run.exec("notepad.exe");   //调用本机程序，必须进行异常处理
			
		}catch(Exception e){
			e.printStackTrace();  //打印异常信息
			
		}

		

	}

}
