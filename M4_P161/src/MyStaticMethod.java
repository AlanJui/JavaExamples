import DomainModel.Employee;
import DomainModel.Manager;


public class MyStaticMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodDay.sayHello();
		GoodDay.sayGoodMorining("Alan");
		
		Clothes myClothes = new Clothes("Blue", 'L');
		System.out.printf("The color of my clothes is %s. \n", 
				myClothes.tellMeColor());
		
		People alan = new People();
		alan.name = "Alan";
		alan.gender = 1;
		alan.age = 52;
		
		System.out.printf("The age of Alan are %d. \n", alan.tellMeYourAge());
		
		/************** 不在同一 package 使用 class **************/
		// 當 Class 的 property ，屬性為 public 
		Employee stacy = new Employee();
		stacy.gender = 0;
		stacy.age = 43;
		stacy.name = "吳秀貞";
		System.out.printf("The description of Stacy: \n%s", stacy.toString());
		
		// 當 Class 的 property ，屬性非為 public
		Manager paul = new Manager();
		paul.setName("Paul Change");
		paul.setAge(55);
		paul.setGender(1);
		System.out.printf("The description of Paul are listed below: \n%s", paul);
	}

}

class GoodDay {
	public static void sayHello() {
		System.out.println("Hello! How are you!");
	}
	
	public static void sayGoodMorining(String name) {
		System.out.printf("Good morning %s! \n", name);
	}
}

class Clothes {
	String color;
	char size;
	
	Clothes () {
		super();
		this.color = null;
		this.size = (char) 0;		
	}
	
	Clothes (String color, char size) {
		this.color = color;
		this.size = size;
	}
	
	public String tellMeColor() {
		return this.color;
	}
}