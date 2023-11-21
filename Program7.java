import java.util.Scanner;

public class Program7 {
	public static void main(String[]args){
	//your code goes here
	Scanner sc = new Scanner(System.in);
	double bill = sc.nextDouble();
	double tip = bill* 0.15; 
    // 15% of the bill
	System.out.println(tip);
	}
}