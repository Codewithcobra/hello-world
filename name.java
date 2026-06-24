import java.util.Scanner;

public class name {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your name: ");
       String peru = sc.nextLine();
       System.out.print("Enter your Age: ");
       int age = sc.nextInt();
       System.out.print("Enter your height: ");
       double height = sc.nextDouble();
       System.out.println("Hello, "+ peru +"!");
       System.out.println("Age, " + age );
       System.out.println("Height, " + height +" Meters");
       
        
        System.out.print("Enter the value1: ");
       
        int value1 = sc.nextInt();
        System.out.print("Enter the Value2: ");
        int value2 = sc.nextInt();
        System.out.println("This is the product value "+ value1 * value2 );
        System.out.print("Enter the name: ");
        String nam = sc.nextLine();
        System.out.println("This is my name" + nam);
       
        sc.close();
       
    }
}
