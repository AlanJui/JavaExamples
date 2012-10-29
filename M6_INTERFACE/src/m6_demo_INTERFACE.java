interface Machine  {

    public void charge();       // 充電
    public void makeNoise();	// 發聲
}

/* ============================================================ */

//class Bottom  extends IDisposable ==> 為錯誤的語法
class RobotMan implements Machine {
	
    public void charge() {
    	System.out.println("It needs 10 hours to complete charge.");
    }
    
    public void makeNoise() {
    	System.out.println("Wow! Wow! ");
    }
}

/* ============================================================ */

class ToyCar implements Machine {

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("It needs 2 hours to complete charge.");
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Tseng! Tseng!");
	}
	
}

/* ============================================================ */

abstract class Animal {
	public abstract void bark();
	public abstract void eat();
}

class RobotDog extends Animal
	implements Machine {

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Wang~~~! Wang~~~!");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
}

/* ================================================= */

class m6_lab_INTERFACE {
	
	 public static void main(String[] args) {
		Machine myToy ;
		
		myToy = new RobotMan();
		myToy.makeNoise();
		
		myToy = new ToyCar();
		myToy.makeNoise();
	
		myToy = new RobotDog();
		myToy.makeNoise();
		
	 }
}
