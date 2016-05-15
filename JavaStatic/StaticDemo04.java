package JavaStatic;

//理解main方法

public class StaticDemo04 {
	public static void main(String args[]){
		if(args.length!=3){
			System.out.println("输入参数不足3个，程序直接退出");
			System.exit(1);
		}
		for(int x=0;x<args.length;x++){
			System.out.println("第"+(x+1)+"个参数"+args[x]);
		}
		
	}

}
