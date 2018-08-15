import java.util.Arrays;
import java.util.Scanner;

public class Alphabetize2
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        String[] strings = new String[3];
        String[] tempStrings = new String[3];
        String input;
        String output="";
        String temp;
        boolean isAlphabetical = false;

        System.out.println("Please enter three strings>>");
        for(int i=0;i<strings.length;++i)
        {
            input=scanner.nextLine();
            strings[i]=input;
            tempStrings[i]=input.toLowerCase();
        }

        while(!isAlphabetical)
        {
            isAlphabetical=true;
            for(int i=0;i<tempStrings.length;++i)
            {
                if(i!=tempStrings.length-1 && tempStrings[i].compareTo(tempStrings[i+1])>0)
                {
                    isAlphabetical=false;
                    temp = tempStrings[i];
                    tempStrings[i]=tempStrings[i+1];
                    tempStrings[i+1]=temp;

                    temp = strings[i];
                    strings[i]=strings[i+1];
                    strings[i+1]=temp;
                }
            }
        }
        for(int i=0;i<strings.length;++i)
        {
            output+=strings[i] + " ";
        }

        System.out.println(output);

    }
}
