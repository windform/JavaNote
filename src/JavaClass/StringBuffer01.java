package JavaClass;
//StringBuffer���

public class StringBuffer01 {

	public static void main(String[] args) {
		// �ַ������Ӳ���
		//��֤StringBuffer�������ǿ����޸ĵ�
		StringBuffer buf = new StringBuffer();
		buf.append("hello");
		buf.append(" world").append(" !!!");
		buf.append("\n");
		buf.append("����=").append(1).append("\n");
		buf.append("�ַ�=").append("C").append("\n");
		buf.append("����=").append(true).append("\n");
		fun(buf);
		System.out.println(buf);
	}
	
	public static void fun(StringBuffer s){
		s.append(" �й����� ").append(" ������ ");
	}

}
