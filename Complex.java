
public class Complex {
	
	int realnum;
	int imaginarynum;
	
	public int getRealnum() {
		return realnum;
	}

	public void setRealnum(int realnum) {
		this.realnum = realnum;
	}

	public int getImaginarynum() {
		return imaginarynum;
	}

	public void setImaginarynum(int imaginarynum) {
		this.imaginarynum = imaginarynum;
	}

	
	
	public static void sum(Complex o1, Complex o2)
	{
		System.out.println("The sum of 2 given complex number is :");
		
			System.out.println((o1.realnum+ o2.realnum ) + "+" + (o1.imaginarynum  + o2.imaginarynum) + "i");
		
		 
		
	}

	public static void difference(Complex o1, Complex o2)
	{
		System.out.println("The difference of 2 given complex number is :");
		if(o2.imaginarynum>o1.imaginarynum)
				System.out.println((o1.realnum- o2.realnum ) + "" + (o1.imaginarynum  - o2.imaginarynum) + "i");
		else
			System.out.println((o1.realnum- o2.realnum ) + "+" + (o1.imaginarynum  - o2.imaginarynum) + "i");
	}
	public static void product(Complex o1, Complex o2)
	{
		System.out.println("The product of 2 given complex number is :");
		System.out.println((o1.realnum * o2.realnum - o1.imaginarynum  - o2.imaginarynum ) + "+" + (o1.realnum * o2.imaginarynum + o1.imaginarynum * o2.realnum) + "i");
	}
}
