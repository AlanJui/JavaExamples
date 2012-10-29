
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer myIntObj = new Integer(10);
		System.out.println("myIntObj = " + myIntObj);
		
		Integer MyIntObj2 = 100;
		System.out.println("myIntObj2 = " + MyIntObj2);
		
		/* ====================================================== */
		
		Object obj = null;
		obj = 267;
		
		int mtv = -80;
		if (obj instanceof Integer) {
			mtv = (Integer) obj;
		}
		System.out.println("mtv = " + mtv);
		
		/* ====================================================== */
		
		int num = -89;

		Object obj2;
		obj2 = "字串";
		obj2 = 500;
		
		boolean isInteger = obj2 instanceof Integer;
		if (isInteger) {
			num = (Integer) obj2;
		}
		System.out.println("num = " + num);
	}

}
