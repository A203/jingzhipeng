
public class Example01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person2 p=new Person2(20);
		System.out.println(p.age);
	}

}

class Person2{
	Person2(int age){
		this.age=age;
	}
	
	//��ʼ����
	{
		age=18;
	}
	
	int age;
}