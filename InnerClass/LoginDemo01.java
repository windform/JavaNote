package InnerClass;

public class LoginDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=2){
			System.out.println("����Ĳ�����ʽ����ȷ��ϵͳ�˳�");
			System.out.println("��ʽ��java LoginDemo01 �û��� ����");
			System.exit(1);
		}
		String name=args[0];
		String password=args[1];
		if(name.equals("whiteblue") && password.equals("123456")){
			System.out.println("��ӭ"+name+"����");
		}else{
			System.out.println("������û���������");
		}

	}

}
