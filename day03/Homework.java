package homework;

public class Homework {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Army army=new Army(15);
		Tank tank=new Tank();
		Flighter flighter=new Flighter();
		WarShip warship=new WarShip();
		
		army.addWeapon(tank);
		army.addWeapon(flighter);
		army.addWeapon(warship);
		
		army.attackAll();
		army.moveAll();
		
	}

}

interface Assaultable{
	void attack();
}

interface Mobile{
	void move();
}

abstract class Weapon implements Assaultable,Mobile{
	public abstract void attack();
	public abstract void move();
}

class Tank extends Weapon{
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Tank attacks");
	}

	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Tank moves");
	}
	
}

class Flighter extends Weapon{
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Flighter attacks");	
	}

	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Flighter moves");
	}
	
}

class WarShip extends Weapon{
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("WarShip attacks");
	}

	public void move() {
		// TODO Auto-generated method stub
		System.out.println("WarShip moves");
	}
	
}

class Army{
	private Weapon[] w = null;
	private int size = 0;
	
	Army(int i){
		Weapon[] w=new Weapon[i];
	}
	
	
	void addWeapon(Weapon we){
		if(size>=w.length){
			System.out.println("Military equipment is enough.");
			//装备数已经达到最大值
			return;
		}
		else{
			w[size]=we;
			size++;
		}
	}
	
	
	void attackAll(){
		for(Weapon wa:w){
			if(wa!=null){
				wa.attack();
			}
		}
	}
	
	
	void moveAll(){
		for(Weapon wa:w){
			if(wa!=null){
				wa.move();
			}
		}
	}
}
