package JavaClass;
//Runtime���ʾ����ʱ�����࣬��һ����װ��JVM���̵���

//�õ�JVM���ڴ�ռ���Ϣ
public class RuntimeDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime run=Runtime.getRuntime();   //ʵ����
		System.out.println("JVM����ڴ���:"+run.maxMemory());
		System.out.println("JVM�ڴ������:"+run.freeMemory());
		
		String str = "Hello "+"World"+" !!!"+"\t"+" Welcome to "+ "The World of Web"+ "~";
		
		for(int x=0; x<1000; x++){   //��������������ѭ��
			str+=x;
		}
		System.out.println(str);
		System.out.println("����String֮���JVM����ʣ����:"+run.freeMemory());
		
		run.gc();  //���������ռ����ͷſռ�
		System.out.println("�����ռ�֮����ڴ����ʣ����:"+run.freeMemory());
		

	}

}
