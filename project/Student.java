package project;

public class Student {
	private String stuno;
	private String name;
	private float math;
	private float english;
	private float computer;
	public Student(){};
	public Student(String stuno,String name,float math,float english,float computer){
		this.setStuno(stuno);
		this.setName(name);
		this.setMath(math);
		this.setEnglish(english);
		this.setComputer(computer);
	};
	public void setStuno(String s){
		stuno=s;
	}
	public void setName(String n){
		name=n;
	}
	public void setMath(float m){
		math=m;
	}
	public void setEnglish(float e){
		english=e;
	}
	public void setComputer(float c){
		computer=c;
	}
	public String getStuno(){
		return stuno;
	}
	public String getName(){
		return name;
	}
	public float getMath(){
		return math;
	}
	public float getEnglish(){
		return english;
	}
	public float getComputer(){
		return computer;
	}
	public float sum(){
		return math+english+computer;
	}
	public float avg(){
		return this.sum()/3;
	}
	public float max(){
		float max=math;
		max=max>computer ? max : computer;
		max=max>english ? max : english;
		return max;
	}
	public float min(){
		float min=math;
		min=min<computer ? min : computer;
		min=min<english ? min : english;
		return min;
	}

}
