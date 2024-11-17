import java.util.Scanner;
public class IT24101832Lab4Q1 {
	public static void main ( String[] args )
	{
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = input.nextInt();

	if (num==0){
		System.out.print("The number is Zero");
	}else if (num>0){
		System.out.print("The number is Positive");
	}else{
		System.out.print("The number is Negative");
	}
}
}