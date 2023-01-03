import java.util.Scanner;
public class App {
    public static void main(String[] args) {
     System.out.println(powerFunction(3, 4));
    }
    public static float average(float a, float b, float c)
    {
        float avg = (a + b + c) / 3;
        return avg; 
    }

    public static int oddSum(int n)
    {
        int sum = 0; 
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 != 0)
            {
                sum += i;
            }
        }
        return sum;
    }

    public static float greaterNum(float a, float b)
    {
        if(a > b)
        {
            return a;
        }
        else 
        {
            return b;
        } 
        
    }

    public static float circum(float radius)
    {
        return 2 * 3.14f * radius;
    }

    public static void ageCheck(int age)
    {
        if(age > 18)
        {
            System.out.println("Eligible to vote");
        }
        else 
        {
            System.out.println("Not eligible to vote");
        }
    }

    public static void infiniteLoop()
    {
        int i = 0;
        while(i != 1)
        {
            System.out.println("Loop");
        }
    }

    public static int powerFunction(int x, int n)
    {
        int product = 1;
        for(int i = 0; i < n; i++)
        {
            product = product * x;
        }
        return product;
    }

   
}
