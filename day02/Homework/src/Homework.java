import java.util.Random;


public class Homework {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr=new int[20][5];
		Random rand=new Random();
		
		System.out.println("�ð�ѧ���ĳɼ�Ϊ��coreC++  coreHava         Servlet           JSP             EJB");
		for(int i=0;i<20;i++)
		{
			System.out.print("��"+(i+1)+"λѧ���ĳɼ���");
			for(int j=0;j<5;j++)
			{
				arr[i][j]=rand.nextInt(100);
				System.out.print(arr[i][j]+"\t\t");
			}
			System.out.println();
		}
		
		System.out.println("**************************************************");
		System.out.println("ÿ��ѧ�����ܳɼ�Ϊ��");
		int[] sum=new int[20];
		for(int i=0;i<20;i++)
		{
			System.out.print("��"+(i+1)+"λѧ�����ܳɼ���");
			for(int j=0;j<5;j++)
			{
				sum[i]=arr[i][j]+sum[i];
			}
			System.out.print(sum[i]+"\n");
		}
		
		System.out.println("**************************************************");
		
		System.out.println("ÿ�ſε�ƽ���ɼ�Ϊ��coreC++  coreHava         Servlet          JSP             EJB");
		System.out.print("ÿ�ſε�ƽ���ɼ�Ϊ��");
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