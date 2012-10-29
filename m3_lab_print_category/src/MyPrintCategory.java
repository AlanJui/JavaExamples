
public class MyPrintCategory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age = (int) (Math.random() * 130);

		System.out.println("age = " + age);
		if (age < 6) {
			System.out.println("學齡前（6歲以下）");
		} else if (age >= 6 && age <= 12) {
			System.out.println("國小（6 ～ 12 歲）");
		} else if (age >= 13 && age <= 19) {
			System.out.println("青少年（13 ～ 19 歲）");
		} else if (age >= 20 && age <= 39) {
			System.out.println("青年（20 ～ 39 歲）");
		} else if (age >= 40 && age <= 59) {
			System.out.println("壯年（40 ～ 59 歲）");
		} else if (age >= 60 && age <= 119) {
			System.out.println("熟年（60 ～ 119 歲）");
		} else if (age >= 120) {
			System.out.println("人瑞（120歲以上）");
		}
	}

}
