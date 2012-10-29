package DomainModel;


public class Manager {
	String name;
	int gender;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		String returnString = new String();
		
		returnString = String.format("Name = %s \n", this.name) 
				+ String.format("gender = %d \n", this.gender) 
				+ String.format("Age = %d \n", this.age);
		
		return returnString;
	}
}
