
public class Demo07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //��ӡ1~99��һ����5��������
		for(int i=1;i<=99;i++)
		{
			if(i%5==0){
				System.out.println(i);
				break;
			}
			
		}
		
		//��ӡ1~99�����ܱ�5��������
		int num=0;
		for(int i=1;i<=99;i++)
		{
			if(i%5==0){
				System.out.println(i);
				continue;
			}
			num++;
		}
		System.out.println("���ܱ�5���������ĸ���Ϊ��"+num);
	}

}
