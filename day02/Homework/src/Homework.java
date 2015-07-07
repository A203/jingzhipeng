import java.util.Random;


public class Homework {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr=new int[20][5];
		Random rand=new Random();
		
		System.out.println("该班学生的成绩为：coreC++  coreHava         Servlet           JSP             EJB");
		for(int i=0;i<20;i++)
		{
			System.out.print("第"+(i+1)+"位学生的成绩：");
			for(int j=0;j<5;j++)
			{
				arr[i][j]=rand.nextInt(100);
				System.out.print(arr[i][j]+"\t\t");
			}
			System.out.println();
		}
		
		System.out.println("**************************************************");
		System.out.println("每名学生的总成绩为：");
		int[] sum=new int[20];
		for(int i=0;i<20;i++)
		{
			System.out.print("第"+(i+1)+"位学生的总成绩：");
			for(int j=0;j<5;j++)
			{
				sum[i]=arr[i][j]+sum[i];
			}
			System.out.print(sum[i]+"\n");
		}
		
		System.out.println("**************************************************");
		
		System.out.println("每门课的平均成绩为：coreC++  coreHava         Servlet          JSP             EJB");
		System.out.print("每门课的平均成绩为：");
		int[] average=new int[5];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<20;j++)
			{
				average[i]=arr[j][i]+average[i];
			}
			System.out.print(average[i]/20+"\t\t");
		}
	}

}