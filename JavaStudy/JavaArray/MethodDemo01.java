public class MethodDemo01{
	public static void main(String[] args){
		printInfo();
		printInfo();
		printInfo();
		System.out.println("Hello World");
	}
	public static void printInfo(){
		char c[]={'H','e','l','l','o',',','W','o','r','l','d'};
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]);
		}
		System.out.println("");
	}
}