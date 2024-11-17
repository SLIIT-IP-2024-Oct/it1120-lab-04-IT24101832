import java.util.Scanner;
public class IT24101832Lab4Q3 {
	public static void main ( String[] args )
	{
	String result;

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = input.nextInt();
	
	result =(num>0) ? "The number is: Positive" :
		(num<0) ? "The number is: Negative" :
		"The number is: Zero";

	System.out.println(result);
	}
}

	