import java.util.Scanner;

public class input {

    public static void main(String args []){

        int month, year;
        String name;

        System.out.println("Enter Your Name: ");

        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        System.out.println("Enter Your Birth Month: ");
        month = scanner.nextInt();

        System.out.println("Enter Your Birth Year: ");
        year = scanner.nextInt();

        System.out.println("Hello " + name + "!");
        System.out.println("You were born in " + month + " of " + year + ".");

        scanner.close();
    
    }
    
}
