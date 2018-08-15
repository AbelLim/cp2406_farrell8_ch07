import java.util.Scanner;

public class CountWords
{
    public static void main(String args[])
    {
        final char[] SEPARATORS = {' ', '.', ',', ';', '?', '!', '-'};
        String input;
        Scanner scanner = new Scanner(System.in);
        int wordCount = 0;

        System.out.println("Enter a string >>");
        input = scanner.nextLine();
        if(input.length() !=0)
        {
            wordCount=1;
            for (int c = 0; c < SEPARATORS.length; ++c) {
                if (SEPARATORS[c] == input.charAt(0)) {
                    wordCount=0;
                }
            }
        }

        for(int i=0;i<input.length();++i)
        {
            if(i!=input.length()-1) {
                System.out.println(input.charAt(i));
                for (int c = 0; c < SEPARATORS.length; ++c) {
                    if (SEPARATORS[c] == input.charAt(i)) {
                        wordCount++;
                    }
                }
            }
        }

        System.out.println("There are " + wordCount + " words in the string.");
    }
}
