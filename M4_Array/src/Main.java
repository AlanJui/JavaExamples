/*
 * 陳列及 static 變數／方法呼叫的練習
 */

public class Main {
	
	static int myNumberArray[] = {-3, -2, -1, 0, 1, 2, 3};
	static String books[][] = {
		{"Objective-C", "Alan", "$500"},
		{"iOS SDK 6", "Brian", "$750"},
		{"Java SE 7 Dev Manual", "Cindy", "$600"}
	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("===========================================");
		System.out.println("The elements of myNumberArray are:");
		for (int i = 0; i < myNumberArray.length; i++) {
			System.out.printf("myNumberArray[%d] = %2d \n", i, myNumberArray[i]);
		}
	
		System.out.println("===========================================");
		int i = 0;
		for (int number : myNumberArray) {
			System.out.printf("myNumberArray[%d] = %2d \n", i++, number);
		}
		
		System.out.println("===========================================");
		System.out.println("任意出個三國人物");
		System.out.printf("選出的是......%s\n", giveMeSomebodyName());
		
		System.out.println("===========================================");
		int idx = 2;
		System.out.printf("Book %d -> Name = %s\n", idx, books[idx][0]);
		System.out.printf("Book %d -> Author = %s\n", idx, books[idx][1]);
		System.out.printf("Book %d -> Price = %s\n", idx, books[idx][2]);

		System.out.println("===========================================");
		/***
		String [] peoples;
		peoples = new String[3];
		***/
		String [] peoples = new String[3];
		peoples[0] = new String("Alan");
		peoples[1] = new String("Brian");
		peoples[2] = new String("Cindy");
		for (String name : peoples) {
			System.out.printf("%s \n", name);
		}
	}
	
	static String giveMeSomebodyName() {
		String nameList[] = {"劉備", "關雲", "張飛"};
		int index = (int) (Math.random() * 3);
		return nameList[index];
	}

}
