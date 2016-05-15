public class ArrayDemo05{
	public static void main(String[] args){
		int score[]={67,89,87,69,90,100,75,90};
		int max=0;
		int min=0;
		max=min=score[0];
		for(int x=0;x<score.length;x++){
			if(score[x]>max){
				max=score[x];
			}
			if(score[x]<min){
				min=score[x];
			}
		}
		System.out.println("zui da shu zi: "+max);
		System.out.println("zui xiao shu zi: "+min);	
	}
}