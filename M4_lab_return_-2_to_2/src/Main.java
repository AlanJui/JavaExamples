
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pick random number ten times:");
		for (int i = 0; i < 10; i++) {
			System.out.printf("The random number is %2d.\n", getRandomValue() );
		}
	}

	static int getRandomValue() {
		int randomValue[] = {-2, -1, 0, 1, 2};
		int index = (int) (Math.random() * 5);
		
		return randomValue[index];
	}
	
}
