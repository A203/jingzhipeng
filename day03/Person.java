
public class Person {

	String name;
	String add;
	int age;
	
	void introduce(){
		System.out.println("my name is "+name+",l am "+age+",l live in "+add);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person=new Person();
		person.name="jim";
		person.age=20;
		person.add="Beijing";
		
		person.introduce();
	}

}
