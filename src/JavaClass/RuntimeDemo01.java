package JavaClass;
//Runtime类表示运行时操作类，是一个封装了JVM进程的类

//得到JVM的内存空间信息
public class RuntimeDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime run=Runtime.getRuntime();   //实例化
		System.out.println("JVM最大内存量:"+run.maxMemory());
		System.out.println("JVM内存空闲量:"+run.freeMemory());
		
		String str = "Hello "+"World"+" !!!"+"\t"+" Welcome to "+ "The World of Web"+ "~";
		
		for(int x=0; x<1000; x++){   //产生大量垃圾的循环
			str+=x;
		}
		System.out.println(str);
		System.out.println("操作String之后的JVM空闲剩余量:"+run.freeMemory());
		
		run.gc();  //进行垃圾收集，释放空间
		System.out.println("垃圾收集之后的内存空闲剩余量:"+run.freeMemory());
		

	}

}
