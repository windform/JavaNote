package JavaStatic;

//���main����

public class StaticDemo04 {
	public static void main(String args[]){
		if(args.length!=3){
			System.out.println("�����������3��������ֱ���˳�");
			System.exit(1);
		}
		for(int x=0;x<args.length;x++){
			System.out.println("��"+(x+1)+"������"+args[x]);
		}
		
	}

}
