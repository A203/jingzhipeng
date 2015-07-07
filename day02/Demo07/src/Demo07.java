
public class Demo07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //打印1~99第一个被5整除的数
		for(int i=1;i<=99;i++)
		{
			if(i%5==0){
				System.out.println(i);
				break;
			}
			
		}
		
		//打印1~99所有能被5整除的数
		int num=0;
		for(int i=1;i<=99;i++)
		{
			if(i%5==0){
				System.out.println(i);
				continue;
			}
			num++;
		}
		System.out.println("不能被5整除的数的个数为："+num);
	}

}
