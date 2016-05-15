package JavaInterfaceCase;

//���ģʽ�������������
interface Window{  //����Window�ӿڣ���ʾ���ڲ���
	public void open();		//��
	public void close();	//�ر�
	public void activated(); //�
	public void iconified();  //������С��
	public void deiconified();  //���ڻָ���С
}

//���������ʵ�ֽӿڣ��ڴ����и�д�������������еķ�����Ϊ��
abstract class WindowAdapter implements Window{
	public void activated(){}
	public void close(){}
	public void deiconified(){}
	public void iconified(){}
	public void open(){}
}

//����ֱ�Ӽ̳�WindowAdapter�࣬��ѡ���ʵ����Ҫ�ķ���
class WindowImpl extends WindowAdapter{
	public void open(){
		System.out.println("���ڴ�");
	}
	public void close(){
		System.out.println("���ڹر�");
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
