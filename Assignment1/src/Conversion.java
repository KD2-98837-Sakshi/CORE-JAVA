import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		num=sc.nextInt();
		Integer n1=num;
		String bin=n1.toBinaryString(num);
		String oct=n1.toOctalString(num);
		String hex=n1.toHexString(num);
		System.out.println("Given Number: "+num);
		System.out.println("Binary equivalent: "+bin);
		System.out.println("Octal equivalent: "+oct);
		System.out.println("Hexadecimal equivalent: "+hex);
	}

}
