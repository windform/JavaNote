package com.imooc.second;

public class Telphone {
	//���Է�װ
	private float screen;
	private float cpu;
	private float mem;
	//���캯��
	public float getScreen(){
		System.out.println(screen);
		return screen;
	};
	public void setScreen(float newScreen){
		screen=newScreen;
	};
	public Telphone(float newScreen,float newCpu,float newMem){
		screen=newScreen;
		cpu=newCpu;
		mem=newMem;
		System.out.println(screen+","+cpu+","+mem);
	};

}
