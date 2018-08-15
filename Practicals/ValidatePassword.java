import java.util.Scanner;

public class ValidatePassword
{
    public static void main(String args[])
    {
        final int UPPERCASE = 2, LOWERCASE = 2, DIGIT = 2;
        int uppercase = 0, lowercase = 0, digit = 0;
        boolean isValid = false;
        String password;
        Scanner scanner = new Scanner(System.in);

        while(!isValid)
        {
            System.out.println("Please input a password. \nIt must contain at least " + UPPERCASE + " uppercase characters, " + LOWERCASE + " lowercase characters and " + DIGIT + " digits: ");
            password = scanner.nextLine();

            for(int i=0;i<password.length();++i)
            {
                if(Character.isUpperCase(password.charAt(i)))
                    ++uppercase;

                else if(Character.isLowerCase(password.charAt(i)))
                    ++lowercase;

                else if(Character.isDigit(password.charAt(i)))
                    ++digit;
            }

            if(uppercase < UPPERCASE)
                System.out.println("You need at least " + UPPERCASE + " uppercase characters.");
            else if(lowercase < LOWERCASE)
                System.out.println("You need at least " + LOWERCASE + " lowercase characters.");
            else if(digit < DIGIT)
                System.out.println("You need at least " + DIGIT + " digits.");
            else
            {
                System.out.println("Your password is valid");
                isValid = true;
            }

            uppercase = 0;
            lowercase = 0;
            digit = 0;
        }
    }
}
