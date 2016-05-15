package JavaQuote;

class Demo9{
	private int temp=30;
	public void fun(Demo9 d2){
		d2.temp=50;
	}
	public int getTemp(){
		return temp;
	}
	public void setTemp(int t){
		temp=t;
	}
}

public class RefDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo9 d1=new Demo9();
		d1.setTemp(50);
		d1.fun(d1);
		System.out.println("temp="+d1.getTemp());

	}

}
