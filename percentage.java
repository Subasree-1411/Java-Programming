import java.util.Scanner;
class percentage{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("English: ");
        int english = sc.nextInt();
        System.out.print("Maths: ");
        int maths = sc.nextInt();
        System.out.print("Science: ");
        int science = sc.nextInt();
        System.out.print("Social: ");
        int social = sc.nextInt();
        System.out.print("Tamil: ");
        int tamil = sc.nextInt();
        int total = english + maths + science + social + tamil;
        double average = total / 5;
        double percentage = (total / 500) * 100;
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");
    }
}