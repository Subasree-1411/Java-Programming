import java.util.Scanner;
class details{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Height: ");
        double height = sc.nextDouble();
        System.out.print("Grade: ");
        char grade = sc.next().charAt(0);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);      
    }
}