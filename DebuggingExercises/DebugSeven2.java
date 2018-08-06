// Program prompts user to enter a series of integers
// separated by spaces
// Program converts them to numbers and sums them
import java.util.*;
public class DebugSeven2
{
   public static void main(String[] args)
   {
      String str;
      int length;
      int num;
      int lastSpace = 0;
      int sum = 0;
      String partStr;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a series of integers separated by spaces >> ");
      str = in.nextLine();
      length = str.length();
      for(int x = 0; x < length; ++x)
      {
          if(str.charAt(x) == ' ')
          {
              partStr = str.substring(lastSpace, x);
              lastSpace = x+1;
              num = Integer.parseInt(partStr);
              sum += num;
              System.out.println(num);
          }

          else
          {
              if(x == length-1)
              {
                  partStr = str.substring(lastSpace, x+1);
                  num = Integer.parseInt(partStr);
                  sum += num;
                  System.out.println(num);
              }
          }
      }
      System.out.println("         -------------------" +
               "\nThe sum of the integers is " + sum);
   }
}