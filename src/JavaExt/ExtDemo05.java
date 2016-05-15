package JavaExt;
//继承的应用：排序类和反转类

//定义数组操作类
class Array{
	private int temp[];
	private int foot;
	public Array(int len){
		if(len>0){
			this.temp=new int[len];
		}else{
			this.temp=new int[1];
		}
	}
	public boolean add(int i){
		if(this.foot<this.temp.length){
			this.temp[foot]=i;
			foot++;
			return true;
		}else{
			return false;
		}
	}
	public int[] getArray(){
		return this.temp;
	}
}

//定义反转类
class ReverseArray extends Array{
	public ReverseArray(int len){
		super(len);
	}
	public int[] getArray(){
		int t[]=new int[super.getArray().length];
		int count=t.length-1;
		for(int x=0;x<t.length;x++){
			t[count]=super.getArray()[x];
			count--;
		}
		return t;
	}
}

//定义排序类
class SortArray extends Array{
	public SortArray(int len){
		super(len);
	}
	public int[] getArray(){
		java.util.Arrays.sort(super.getArray());
		return super.getArray();
	}
}

public class ExtDemo05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实例化反转对象
		ReverseArray a = new ReverseArray(5);
		a.add(23);
		a.add(21);
		a.add(2);
		a.add(42);
		a.add(5);
		a.add(6);
		print(a.getArray());
		System.out.println("\t");
		SortArray b = new SortArray(5);
		b.add(23);b.add(21);b.add(2);b.add(42);b.add(5);b.add(6);
		print(b.getArray());
	}
	public static void print(int i[]){
		for(int x=0; x<i.length;x++){
			System.out.print(i[x]+"、");
		}
	}

}
