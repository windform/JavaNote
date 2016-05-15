package JavaInterfaceCase;

//���ģʽ-�������
//����NetWork�ӿ�
interface Network{
	public void browse();
}
//��ʵ����������
class Real implements Network{
	public void browse(){
		System.out.println("���������Ϣ");
	}
}
//��������
class Proxy implements Network{   //��������
	private Network network;
	public Proxy(Network network){	//���ô������ʵ����
		this.network=network;		//���ô��������
	}
	public void check(){			//�������������ز���
		System.out.println("����û��Ƿ�Ϸ�");
	}
	public void browse(){
		this.check();			//����ͬʱ���ö�������ҵ����صĲ���
		this.network.browse();	//������ʵ��������
	}
}

public class InterfaceCaseDemo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Network net = null;   //����ӿڶ���
		net=new Proxy(new Real());   //ʵ��������ͬʱ����������ʵ����
		net.browse();				//�ͻ�ֻ�������������һ������

	}

}
