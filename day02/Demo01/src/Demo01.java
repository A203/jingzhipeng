import java.util.Scanner;


public class Demo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int score=scanner.nextInt();
		
		if(score>=60)
		{
			System.out.println("�ɼ��ϸ�");
		}
		else
		{
			System.out.println("�ɼ����ϸ�");
		}
	}

}
