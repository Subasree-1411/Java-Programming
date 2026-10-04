import java.util.Scanner;
class age{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Birth Year: ");
        int birthyear = sc.nextInt();
        System.out.print("Enter Current Year: ");
        int currentyear = sc.nextInt();
        int Age = currentyear - birthyear;
        System.out.println("Your age is: " + Age);
    }
}