package DomainModel;

public class Employee {
	public String name;
	public int gender;
	public int age;
	
	public String toString() {
		String returnString = new String();
		
		returnString = String.format("Name = %s \n", this.name) 
				+ String.format("gender = %d \n", this.gender) 
				+ String.format("Age = %d \n", this.age);
		
		return returnString;
	}
}
