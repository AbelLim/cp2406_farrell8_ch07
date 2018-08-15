import java.util.Arrays;
import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String args[])
    {
        String input;
        String[] babyNames = new String[3];
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<3;i++)
        {
            System.out.println("Please enter name option " + (i+1) + ": ");
            input = scanner.next();
            babyNames[i] = input;
        }

        for(int x=0; x<babyNames.length;x++)
        {
            for(int y=0; y<babyNames.length;y++)
            {
                System.out.println(babyNames[x] + " " + babyNames[y]);
            }
        }

    }
}
