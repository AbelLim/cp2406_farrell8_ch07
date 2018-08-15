public class CountMovieSpaces
{
    public static void main(String args[])
    {
        final String QUOTE = "There is no try. There is only do or do not.";
        int count=0;
        for(int i=0; i<QUOTE.length();i++)
        {
            if(QUOTE.charAt(i)==' ')
                count++;
        }
        System.out.println("There are " + count + " spaces in [" + QUOTE + "]");
    }
}
