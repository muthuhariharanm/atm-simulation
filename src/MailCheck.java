/**
 * Created by Muthu Hariharan M on 10/25/2018.
 */
package oopsProject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailCheck
{
    public static boolean isValidMail(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
}
