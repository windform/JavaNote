public class ArrayDemo06{
	public static void main(String[] args){
		int score[]={67,89,87,69,90,100,75,90};
		for(int x=1;x<score.length;x++){
			for(int y=0;y<score.length;y++){
				if(score[x]<score[y]){
					int temp=score[x];
					score[x]=score[y];
					score[y]=temp;
				}

			}
		}
		for(int i=0; i<score.length; i++){
			System.out.println(score[i]);
		}	
	}
}