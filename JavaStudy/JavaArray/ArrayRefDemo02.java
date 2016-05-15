public class ArrayRefDemo02{
	public static void main(String[] args){
		int temp[]=fun();
		print(temp);
	}
	public static void print(int x[]){
		for(int i=0;i<x.length;i++){
			System.out.print(x[i]+",");
		}
	}
	public static int[] fun(){
		int arr[]={2,4,6,8,10};
		return arr;
	}
}