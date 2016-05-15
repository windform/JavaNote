public class ArrayRefDemo04{
	public static void main(String[] args){
		int score[]={87,56,98,12,65,43,95,100,256,40};
		int age[]={12,9,16,13,10,56,80};
		java.util.Arrays.sort(score);
		print(score);
		System.out.println("\n----------------------------------------");
		java.util.Arrays.sort(age);
		print(age);
	}
	public static void print(int x[]){
		for(int i=0;i<x.length;i++){
			System.out.print(x[i]+",");
		}
	}
}