public class ArrayRefDemo03{
	public static void main(String[] args){
		int score[]={87,56,98,12,65,43,95,100,256,40};
		int age[]={12,9,16,13,10,56,80};
		sort(score);
		print(score);
		System.out.println("\n---------------------------");
		sort(age);
		print(age);
	}
	public static void sort(int temp[]){
		for(int i=1;i<temp.length;i++){
			for(int j=0;j<temp.length;j++){
				if(temp[i]<temp[j]){
					int x=temp[i];
					temp[i]=temp[j];
					temp[j]=x;
				}
			}
		}
	}
	public static void print(int x[]){
		for(int i=0;i<x.length;i++){
			System.out.print(x[i]+",");
		}
	}
}