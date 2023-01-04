import java.util.Scanner;
public class Strings {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        sc.close();
        str = str + "ello";
        System.out.println("The String entered is: " + str);

    }
}
