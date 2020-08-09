

import java.util.*;

public class ComplexNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Complex c1=new Complex();
		Complex c2=new Complex();
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first complex number");
		
		String str = scan.nextLine();
		String[] ch= str.split("\\+|i");
		
		System.out.println(ch[1]);
		c1.setRealnum(Integer.parseInt(ch[0]));
		c1.setImaginarynum(Integer.parseInt(ch[1]));
		
       System.out.println("Please enter the Second complex number");
		
		String str2 = scan.nextLine();
		String[] ch2= str2.split("\\+|i");
		
		c2.setRealnum(Integer.parseInt(ch2[0]));
		c2.setImaginarynum(Integer.parseInt(ch2[1]));
		System.out.println(ch2[1]);
		
		Complex.sum(c1, c2);
		Complex.difference(c1, c2);
		Complex.product(c1, c2);

	}

}
