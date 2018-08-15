import java.util.Scanner;

public class CountMovieSpaces2
{
    public static void main(String args[])
    {
        String quote;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a movie quote: ");
        quote = scanner.nextLine();

        int count=0;
        for(int i=0; i<quote.length();i++)
        {
            if(quote.charAt(i)==' ')
                count++;
        }
        System.out.println("There are " + count + " spaces in [" + quote + "]");
    }
}
