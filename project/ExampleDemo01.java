package project;

public class ExampleDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student("WBLD-01","�ζ�",95.0f,89.0f,96.0f);
		System.out.println("��ű�ţ�"+stu.getStuno());
		System.out.println("���������"+stu.getName());
		System.out.println("��ѧ�ɼ���"+stu.getMath());
		System.out.println("Ӣ��ɼ���"+stu.getEnglish());
		System.out.println("������ɼ���"+stu.getComputer());
		System.out.println("�ܳɼ���"+stu.sum());
		System.out.println("ƽ���֣�"+stu.avg());
		System.out.println("��߷֣�"+stu.max());
		System.out.println("��ͷ֣�"+stu.min());

	}

}
