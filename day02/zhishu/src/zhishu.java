
public class zhishu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2~100之间的所有质数

		for(int num=2;num<=100;num++)
		{
			boolean flag=true;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.println(num);
			}
		}
	}

}
