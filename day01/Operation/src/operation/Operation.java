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
		
		//��Ԫ�����
		int score=78;
		String type=score<60?"������":"����";
		System.out.println(type);
		
		//"+"�����ַ������ӷ�
		System.out.println("1"+1+1);
		System.out.println(1+1+"1");//����Զ������ͬ
		
	}

}
