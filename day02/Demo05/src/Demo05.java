
public class Demo05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		while(i<=100){
			System.out.println(i);
			i++;
		}
		
		System.out.println("跳出循环的i："+i);
		
		i=1;
		do{
			i++;
		}while(i<=100);
			
		System.out.println("do while时跳出循环的i："+i);
	}

}
