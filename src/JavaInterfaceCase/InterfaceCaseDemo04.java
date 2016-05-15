package JavaInterfaceCase;

//�ӿڵ�ʵ��Ӧ�á����ƶ���׼
interface USB{  //����USB�ӿ�
	public void start();
	public void stop();
}
class Computer{   
	public static void plugin(USB usb){   //ֻҪ��USB���豸�����Բ���
		usb.start();                      //��USB�豸��ʼ����
		System.out.println("========�豸����==========");
		usb.stop();						//��USB�豸ֹͣ����
	}
}
class Flash implements USB{   //U��
	public void start(){
		System.out.println("U�̿�ʼ����");
	}
	public void stop(){
		System.out.println("U��ֹͣ����");
	}
}
class Print implements USB{  //��ӡ��
	public void start(){
		System.out.println("��ӡ����ʼ����");
	}
	public void stop(){
		System.out.println("��ӡ��ֹͣ����");
	}
}

public class InterfaceCaseDemo04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer.plugin(new Flash());   //����U��
		Computer.plugin(new Print());   //�����ӡ��
	}
}
