
public class Fruit {

	String name;
	int price;
	String add;
	
	Fruit(String n,int p,String a){
		name=n;
		price=p;
		add=a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruit f=new Fruit("apple",8,"USA");
		System.out.println(f.name+"\t"+f.price+"\t"+f.add);
	}

}
