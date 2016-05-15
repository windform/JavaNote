package JavaInterfaceCase;

//接口的实际应用——制定标准
interface USB{  //定义USB接口
	public void start();
	public void stop();
}
class Computer{   
	public static void plugin(USB usb){   //只要是USB的设备都可以插入
		usb.start();                      //让USB设备开始工作
		System.out.println("========设备工作==========");
		usb.stop();						//让USB设备停止工作
	}
}
class Flash implements USB{   //U盘
	public void start(){
		System.out.println("U盘开始工作");
	}
	public void stop(){
		System.out.println("U盘停止工作");
	}
}
class Print implements USB{  //打印机
	public void start(){
		System.out.println("打印机开始工作");
	}
	public void stop(){
		System.out.println("打印机停止工作");
	}
}

public class InterfaceCaseDemo04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer.plugin(new Flash());   //插入U盘
		Computer.plugin(new Print());   //插入打印机
	}
}
