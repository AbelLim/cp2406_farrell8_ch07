import java.util.Arrays;
import java.util.Scanner;

public class Alphabetize
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        String[] strings = new String[3];
        String[] tempStrings = new String[3];
        String input;

        System.out.println("Please enter three strings>>");
        for(int i=0;i<strings.length;++i)
        {
            input=scanner.nextLine();
            input = input.toLowerCase();
            strings[i]=input;
            tempStrings[i]=input;
        }

        Arrays.sort(tempStrings);
        boolean isSame = true;
        if(strings.length==tempStrings.length)
        {
            for(int i=0;i<strings.length;++i)
            {
                if(strings[i]!=tempStrings[i])
                {
                    isSame=false;
                    break;
                }
            }
        }

        if(isSame)
            System.out.println("The strings are in alphabetical order.");
        else
            System.out.println("The strings are not in alphabetical order.");

    }
}
