import java.util.Scanner;
public class helloworld {
public static void main (String args []){
System.out.println ("Taking input from the User");
Scanner sc = new Scanner(System.in);
System.out.println("Enter number1");
int a = sc.nextInt();
System.out.println("Enter number2");
int b = sc.nextInt();
int sum = a +b;
System.out.println("The sum of these numbers is");
System.out.println(sum);
}
}
