package resume;
import java.util.Scanner;

public class Resumebuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner res = new Scanner(System.in);
		
		System.out.println("Please Enter your name: ");
		String Name = res.nextLine();
		
		System.out.println("Please Enter your Email: ");
		String Email = res.nextLine();
		
		System.out.println("Please Enter your Contact: ");
		String Contact = res.nextLine();
		
		System.out.println("Please Enter your School: ");
		String School = res.nextLine();
		
		System.out.println("Please Enter your College: ");
		String College = res.nextLine();
		
		System.out.println("Please Enter your University: ");
		String University = res.nextLine();
		
		System.out.println("Please Enter your Experience in years: ");
		String Experience = res.nextLine();
		
		System.out.println("\n\n\n\n");
		System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("RESUME");
        System.out.println("==============================");
        System.out.println("Name: " + Name);
        System.out.println("Email: " + Email);
        System.out.println("Phone: " + Contact);
        System.out.println("School: " + School);
        System.out.println("College: " + College);
        System.out.println("University: " + University);
        System.out.println("Work Experience: " + Experience);
        System.out.println("==============================");
        System.out.println("==============================");

	}

}
