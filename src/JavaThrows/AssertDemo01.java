package JavaThrows;
/*断言
 * 断言就是肯定某一个结果的返回值是正确的，如果最终此结果的返回值是错误的，则通过断言检查肯定
 * 会提示错误信息
 * 语法：assert boolean 表达式
 * 		assert boolean 表达式：详细的信息
 * 虽然断言返回的是boolean值，但是并不能将其作为条件判断语句
 * 断言虽然有检查运行结果的功能，但是在开发中并不提倡使用断言 */
public class AssertDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]={1,2,3};
		assert x.length==0;   //此处断言数组长度是0，肯定是错误的
	}

}
