package Static;

public class Static {

	int age;
	static String name="jim";
	
	void hello(){
		System.out.println("hello...");
	}
	
	//静态方法，也称之为类方法
	static void hi(){
		System.out.println("hi...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Static d=new Static();
		d.age=18;
		Static.hi();
		System.out.println(d.age+"\t"+Static.name);
	}

}
