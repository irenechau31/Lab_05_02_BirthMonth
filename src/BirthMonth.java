import java.util.Scanner;
public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";
        System.out.println("Enter your birth month [1-12]");
        if(in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();//clear the buffer
            }
        else {
            trash = in.nextLine();
            System.out.println("you must enter a valid number not " + trash);
            System.out.println("run the program again!");
            System.exit(0);
            }
        if (birthMonth >= 1 && birthMonth <=12)
            System.out.println("your birth month is: " + birthMonth);
        else System.out.println("You entered an incorrect month value: " + birthMonth);
    }
}