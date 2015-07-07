package operation;

public class Operation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=11;
		int j=8;
		System.out.println("i+j="+(i+j));
		System.out.println("i*j="+(i*j));
		System.out.println("i/j="+(i/j));
		System.out.println("i%j="+(i%j));
		
		//三元运算符
		int score=78;
		String type=score<60?"不及格":"及格";
		System.out.println(type);
		
		//"+"号做字符串连接符
		System.out.println("1"+1+1);
		System.out.println(1+1+"1");//两者远算结果不同
		
	}

}
