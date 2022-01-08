import java.util.Scanner;
public class helloworld {
public static void main (String args[]){
System.out.println("welcome to class of percentage system;");
Scanner s = new Scanner(System.in);
System.out.println("ener your marks of physics");
int physics = s.nextInt();
System.out.println("ener your marks of chemistry");
int chemistry = s.nextInt();
System.out.println("ener your marks of math");
int math = s.nextInt();
System.out.println("ener your marks of Hindi");
int hindi = s.nextInt();
System.out.println("ener your marks of computer");
int computer = s.nextInt();
System.out.println("ener your marks of social science");
int socialscience = s.nextInt();
System.out.println("total marks of all subject");

int marks = (physics+chemistry+math+hindi+computer+socialscience);
System.out.println(marks);

float percentage = (marks*100)/600;

System.out.println(percentage);

}
}
