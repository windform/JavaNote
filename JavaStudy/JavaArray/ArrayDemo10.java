public class ArrayDemo10{
	public static void main(String[] args){
		int score[][][]={{{32,89},{76,15}},{{65,19},{76,41}},{{34,87},{76,80}}};
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score[i].length;j++){
				for(int k=0;k<score[i][j].length;k++){
					System.out.print(score[i][j][k]+"\t");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}