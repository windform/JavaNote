public class ArrayRefDemo06{
	public static void main(String[] args){
		int score[]={87,56,98,12,65,43,95,100,256,40};
		int age[]={12,9,16,13,10,56,80};
		copy(age,3,score,1,3);
		print(score);
		System.out.println("\n------------------");
		System.out.println(age);
	}
	public static void copy(int s[],int s1,int o[], int s2,int len){
		for(int i=0; i<len; i++){
			o[s2+i]=s[s1+i];
		}
	}
	public static void print(int x[]){
		for(int i=0;i<x.length;i++){
			System.out.print(x[i]+",");
		}
	}
}