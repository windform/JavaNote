package JavaInterfaceCase;

//设计模式-代理设计
//定义NetWork接口
interface Network{
	public void browse();
}
//真实的上网操作
class Real implements Network{
	public void browse(){
		System.out.println("上网浏览信息");
	}
}
//代理上网
class Proxy implements Network{   //代理上网
	private Network network;
	public Proxy(Network network){	//设置代理的真实操作
		this.network=network;		//设置代理的子类
	}
	public void check(){			//与具体上网的相关操作
		System.out.println("检查用户是否合法");
	}
	public void browse(){
		this.check();			//可以同时调用多个与具体业务相关的操作
		this.network.browse();	//调用真实上网操作
	}
}

public class InterfaceCaseDemo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Network net = null;   //定义接口对象
		net=new Proxy(new Real());   //实例化代理，同时传入代理的真实操作
		net.browse();				//客户只关心上网浏览的一个功能

	}

}
