package mosky;
import java.util.*;

public class scan {

    static public String str(String prompt, String pattern, String errmsg)
        throws IllegalStateException
    {
        while(true)
        {
            System.out.print(prompt + " ");
            Scanner scanner = new Scanner(System.in);
            String str = null;

            try {
                str = scanner.next(pattern);
            }
            catch(NoSuchElementException e) {
                // pass
            }

            if(str == null)
                System.out.println(errmsg);
            else
                return str;
        }
    }
}
