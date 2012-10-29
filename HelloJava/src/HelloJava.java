/*************************************************************************
 *  Compilation:  javac HelloWorld.java
 *  Execution:    java HelloWorld
 *
 *  Prints "Hello, World". By tradition, this is everyone's first program.
 *
 *  % java HelloWorld
 *  Hello, World
 *
 *  These 17 lines of text are comments. They are not part of the program;
 *  they serve to remind us about its properties. The first two lines tell
 *  us what to type to compile and test the program. The next line describes
 *  the purpose of the program. The next few lines give a sample execution
 *  of the program and the resulting output. We will always include such 
 *  lines in our programs and encourage you to do the same.
 *
 *************************************************************************/

public class HelloJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        System.out.println("Hello, World");
        
        Clothes c1 = new Clothes();
        
        
        c1.color = "Red";
        c1.size = 'S';
        System.out.printf("c1 = (%s, %c) \n", c1.color, c1.size);
        
        Clothes c2 = new Clothes("Blue", 'L');
        System.out.printf("c2 = (%s, %c)", c2.color, c2.size);
	}

}

class Clothes {
	String color;
	char size;
	
	Clothes () {
		this.color = null;
		this.size = (char) 0;		
	}
	
	Clothes (String color, char size) {
		this.color = color;
		this.size = size;
	}
}
