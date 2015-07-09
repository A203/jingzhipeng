package This;

public class This {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person=new Person("jim",25,"Beijing");
		person.introduce();
	}

}

class Person{
	String name;
	int age;
	String add;
	
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public Person(String name,int age,String add){
		this(name,age);//调用当前类的带两个变量的构造方法
		this.add=add;
	}
	
	void hello(){
		System.out.println("hello...");
	}
	void introduce(){
		System.out.println("my name is "+name+",l am "+age+",l live in "+add);
		this.hello();//this可以省略
	}
	
}