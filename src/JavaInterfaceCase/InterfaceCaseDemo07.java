package JavaInterfaceCase;

//设计模式——适配器设计
interface Window{  //定义Window接口，表示窗口操作
	public void open();		//打开
	public void close();	//关闭
	public void activated(); //活动
	public void iconified();  //窗口最小化
	public void deiconified();  //窗口恢复大小
}

//定义抽象类实现接口，在此类中覆写方法，但是所有的方法体为空
abstract class WindowAdapter implements Window{
	public void activated(){}
	public void close(){}
	public void deiconified(){}
	public void iconified(){}
	public void open(){}
}

//子类直接继承WindowAdapter类，有选择地实现需要的方法
class WindowImpl extends WindowAdapter{
	public void open(){
		System.out.println("窗口打开");
	}
	public void close(){
		System.out.println("窗口关闭");
	}
}

public class InterfaceCaseDemo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Window win = new WindowImpl();
		win.open();
		win.close();

	}

}
