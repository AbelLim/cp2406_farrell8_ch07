import java.util.Arrays;
import java.util.Scanner;

public class ThreeLetterAcronym
{
    public static void main(String args[])
    {
        final char[] SEPARATORS = {' ', '.', ',', ';', '?', '!', '-'};
        boolean isSeparator;
        char[] acronym = new char[3];
        Scanner scanner=new Scanner(System.in);
        String input;
        String output="";
        int acronymCount=0;

        System.out.println("Please enter your string of at least 3 words: ");
        input = scanner.nextLine();
        input=input.toUpperCase();

        for(int i=0;i<input.length();++i)
        {
            isSeparator=false;
            for(int c=0;c<SEPARATORS.length;++c)
            {
                if(input.charAt(i)==SEPARATORS[c])
                    isSeparator=true;
            }

            if(isSeparator)
            {
                acronym[acronymCount] = input.charAt(i+1);
                acronymCount++;
                if(acronymCount>=3)
                    break;
            }

            else if(i==0)
            {
                acronym[acronymCount] = input.charAt(i);
                acronymCount++;
                if(acronymCount>=3)
                    break;
            }
        }

        for(int i=0;i<acronym.length;++i)
        {
            output+=acronym[i];
        }

        System.out.println("Your three-letter acronym is " + output);
    }
}
