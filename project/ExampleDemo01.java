package project;

public class ExampleDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student("WBLD-01","廖东",95.0f,89.0f,96.0f);
		System.out.println("天才编号："+stu.getStuno());
		System.out.println("天才姓名："+stu.getName());
		System.out.println("数学成绩："+stu.getMath());
		System.out.println("英语成绩："+stu.getEnglish());
		System.out.println("计算机成绩："+stu.getComputer());
		System.out.println("总成绩："+stu.sum());
		System.out.println("平均分："+stu.avg());
		System.out.println("最高分："+stu.max());
		System.out.println("最低分："+stu.min());

	}

}
