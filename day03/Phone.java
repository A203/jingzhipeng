
public class Phone {
	
	String name;
	String brand;
	int price;
	
	void call(){
		System.out.println("call somone.....");
		
	}
	void sendMsg(){
		System.out.println("send message.....");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p=new Phone();
		p.name="plus";
		p.brand="Apple";
		p.price=4999;
		
		System.out.println(p.brand+" "+p.price);
		
		p.call();
	}

}
