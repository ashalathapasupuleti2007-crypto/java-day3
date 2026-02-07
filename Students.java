import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:");
        String name = sc.nextLine();

        System.out.println("Enter the age:");
        short age = sc.nextShort();

        System.out.println("Enter the grade:");
        char grade = sc.next().charAt(0);

        System.out.println("Enter the marks:");
        long marks = sc.nextLong();

        String status;
        if (marks >= 35) {
            status = "Pass";
        } else {
            status = "Fail";
        }

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Marks: " + marks);
        System.out.println("Status: " + status);

        sc.close();
    }
}