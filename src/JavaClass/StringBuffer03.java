package JavaClass;
//StringBuffer类库

public class StringBuffer03 {

	public static void main(String[] args) {
		//替换指定范围的内容
		StringBuffer buf = new StringBuffer();
		buf.append("hello ").append("world!!");
		buf.replace(6, 11, "webdeveloper");
		System.out.println("内容替换后的结果："+buf);
		
		//字符串的截取操作
		String str = buf.substring(6,18);
		System.out.println("截取之后的内容:"+str);
		
		//删除指定范围的字符串
		String str1 = buf.delete(6, 15).toString();
		System.out.println("删除之后的内容："+str1);
		
		//查找指定的内容是否存在
		if(buf.indexOf("hello")==-1){
			System.out.println("没有查找到指定的内容");
		}else{
			System.out.println("查找到指定内容");
		}


		
	}
	

}
