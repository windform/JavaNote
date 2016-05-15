package InnerClass;
class Check{
	public boolean validate(String name,String password){
		if(name.equals("whiteblue") && password.equals("password")){
			return true;
		}else{
			return false;
		}
	}
}
class Operate{
	private String info[];
	public Operate(String info[]){
		this.info=info;
	}
	public String login(){
		Check check=new Check();
		this.isExit();
		
		String name=this.info[0];
		String password=this.info[1];
		String str=null;
		if(check.validate(name, password)){
			str="欢迎"+name+"光临";
		}else{
			str="错误的用户名和密码";
		}
		return str;
	}
	public void isExit(){
		if(this.info.length!=2){
			System.out.println("输入的参数格式不正确，系统退出");
			System.out.println("格式：java LoginDemo02 用户名 密码");
			System.exit(1);
		}
	}
}
public class LoginDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operate oper=new Operate(args);
		System.out.println(oper.login());

	}

}
