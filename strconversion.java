import java.util.Scanner;
class strconversion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First string: ");
        String s1= sc.next();
        System.out.print("Enter a second string: ");
        String s2 = sc.next();
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        System.out.println("The sum of the two numbers is: " + (i1 + i2));
    }
}