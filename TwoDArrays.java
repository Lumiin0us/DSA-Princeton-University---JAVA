import java.util.Scanner;
public class TwoDArrays {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colm = sc.nextInt();
        int arr[][] = new int[rows][colm];
        int searchNum = sc.nextInt();

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < colm; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for(int k = 0; k < rows; k++)
        {
            for(int l = 0; l < colm; l++)
            {
                if(arr[k][l] == searchNum)
                {
                    System.out.println("Number found at index: " + k + " " + l);
                }
            }
        }
    }
}
