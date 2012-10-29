import java.util.Vector;


public class Main {
	final static int TotalOfNumbers = 49;
	final static int NumToBeSelected = 6;

	
	static void makeNumList(Vector<Integer> numList) {
		for (int i=1; i <= TotalOfNumbers; i++) {
			numList.addElement(i);
		}
	}
	
	static void printNumList(Vector<Integer> numList) {
		for (int i=0; i < numList.size(); i++) {
			System.out.print(numList.elementAt(i) + "\t");
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> numList = new Vector<Integer>();
		Vector<Integer> luckNumList = new Vector<Integer>();
		
		makeNumList(numList);
		printNumList(numList);
		for (int i=0; i < NumToBeSelected; i++) {
			int index = (int) (Math.random() * numList.size());
			int selectedNum = numList.elementAt(index);
			luckNumList.addElement(selectedNum);
			numList.removeElementAt(index);
		}
		
		System.out.println();
		System.out.printf("The %d lucky numbers are: \n", NumToBeSelected);
		printNumList(luckNumList);
		
	}
	
	/* ===================================================== */
	
	public static void oldStatic() {
		Vector<Integer> numList = new Vector<Integer>();
		int aNumber;
		
		int total = 6;
		for (int i=0; i < total; i++) {
			
			boolean canNotBreak = true;
			int j;
			do {
				aNumber = (int) (Math.random() * 48) + 1;

				for (j = 0; j < numList.size(); j++) {
					if (numList.elementAt(j) == aNumber) {
						continue;
					}
				}
				if (j == 0 || j > numList.size()) {
					canNotBreak = false;
				}
			} while (canNotBreak);
			numList.addElement(aNumber);
			
		}
		
		for (int i=0; i < numList.size(); i++) {
			System.out.printf("numList(%d) = %2d \n", i, numList.elementAt(i));
		}
		
//		for (Integer printNumber: numList) {
//			System.out.printf("")
//		}		

	}

}
