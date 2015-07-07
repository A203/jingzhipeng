import java.util.Scanner;


public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//打印三角形，由用户输入所需行数
		
		/*第一种
		 *
		 **
		 ***
		 ****
		 */
		
		
		Scanner input=new Scanner(System.in);
		
		int num=input.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		/*第二种
		   * 
		  ***
		 *****
		 */
		
		for(int a=1;a<=num;a++)
		{
			for(int b=1;b<=num-a;b++)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=a*2-1;b++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
