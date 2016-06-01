package JavaSystem;

//计算一个程序的执行时间
public class SystemDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		int sum = 0;
		for(int i=0; i<300000000;i++){
			sum+=i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("计算所花费时间："+(endTime - startTime)+"毫秒");

	}

}
