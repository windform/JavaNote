package JavaClass;
//StringBuffer���

public class StringBuffer03 {

	public static void main(String[] args) {
		//�滻ָ����Χ������
		StringBuffer buf = new StringBuffer();
		buf.append("hello ").append("world!!");
		buf.replace(6, 11, "webdeveloper");
		System.out.println("�����滻��Ľ����"+buf);
		
		//�ַ����Ľ�ȡ����
		String str = buf.substring(6,18);
		System.out.println("��ȡ֮�������:"+str);
		
		//ɾ��ָ����Χ���ַ���
		String str1 = buf.delete(6, 15).toString();
		System.out.println("ɾ��֮������ݣ�"+str1);
		
		//����ָ���������Ƿ����
		if(buf.indexOf("hello")==-1){
			System.out.println("û�в��ҵ�ָ��������");
		}else{
			System.out.println("���ҵ�ָ������");
		}


		
	}
	

}
